package dev.lpa;

import java.util.*;

public class Hra {

    private static final String LOKACIE_V_HRE = """
            cesta, na konci cesty, Z: kopec, V: studničný domček, J: údolie, S: les \s
            kopec, na vrchole kopca s výhľadom do všetkých smerov, S: les, V: cesta \s
            studničný domček, vnútri studničného domčeka pri malom prameni, Z: cesta, S: jazero, J: potok \s
            údolie, v lesnom údolí pri zurčiacom potoku, S: cesta, Z: kopec, V: potok \s
            les, na okraji hustého tmavého lesa, J: cesta, V: jazero \s
            jazero, pri alpskom jazere obklopenom divokými kvetmi, Z: les, J: studničný domček \s
            potok, pri potoku s kamenistým dnom, Z: údolie, S: studničný domček \s""";

    private enum Kompas{
        Z, V, J, S;

        private static final String[] smery = {"Zapad", "Vychod", "Juh", "Sever"};

        public String getString(){return smery[ordinal()];}
    }

    private record Lokacia(String opis, Map<Kompas, String> dalsieMiesta) {}

    private String predchadzajuceMiesta;
    private Map<String, Lokacia> MapaHry = new HashMap<>();

    public Hra(){
        nacitatLokaciu(LOKACIE_V_HRE);
    }

    public Hra(String vlastnaLokacia){

    }

    private void nacitatLokaciu(String data) {

        for (String s : data.split("\\R")) {
            String[] parts = s.split(",", 3);
            Arrays.asList(parts).replaceAll(String::trim);
            Map<Kompas, String> nextPlaces = nacitatSmery(parts[2]);
            Lokacia location = new Lokacia(parts[1], nextPlaces);
            MapaHry.put(parts[0], location);
        }
        MapaHry.forEach((k, v) -> System.out.printf("%s:%s%n", k, v));
    }

    private Map<Kompas,String> nacitatSmery (String dalsieMiesto){

        Map<Kompas, String> smery = new HashMap<>();
        List<String> dalsiKrok = Arrays.asList(dalsieMiesto.split(","));

        dalsiKrok.replaceAll(String::trim);
        for (String nextPlace : dalsiKrok){
            String[] rozdelenie =  nextPlace.split(":");
            Kompas kompas = Kompas.valueOf(rozdelenie[0].trim());
            String destinacia = rozdelenie[1].trim();
            smery.put(kompas, destinacia);
        }
        return smery;
    }

    public void spustit() {
        Scanner scanner = new Scanner(System.in);
        String aktualnaPozicia = "cesta";

        while (true) {
            Lokacia aktualna = MapaHry.get(aktualnaPozicia);
            System.out.println("\nNachádzaš sa " + aktualna.opis);
            System.out.println("Môžeš ísť:");

            for (Map.Entry<Kompas, String> entry : aktualna.dalsieMiesta.entrySet()) {
                System.out.println(" - " + entry.getKey().getString() + " -> " + entry.getValue());
            }

            System.out.print("Zadaj smer (Z, V, J, S) alebo X na ukončenie: ");
            String vstup = scanner.nextLine().trim().toUpperCase();

            if (vstup.equals("X")) {
                System.out.println("Hra sa ukončila. Zbohom!");
                break;
            }

            try {
                Kompas smer = Kompas.valueOf(vstup);
                if (aktualna.dalsieMiesta.containsKey(smer)) {
                    aktualnaPozicia = aktualna.dalsieMiesta.get(smer);
                } else {
                    System.out.println("Týmto smerom nemôžeš ísť.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Neplatný smer.");
            }
        }
    }

    public static void main(String[] args) {
        Hra hra = new Hra();
        hra.spustit();
    }
}