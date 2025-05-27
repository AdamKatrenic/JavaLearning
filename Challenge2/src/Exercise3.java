public class Exercise3 {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes(int kilobytes){

        if(kilobytes < 0){
            System.out.println("Invalid Value");
            return;
        }
        int megaBytes = kilobytes/1024;
        int remainingKiloBytes = kilobytes%1024;
        System.out.println(kilobytes + " KB " + "= " + megaBytes + " MB " + "and " + remainingKiloBytes + " KB");
    }

}
