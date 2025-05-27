public class Main {

    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation(" ");
        printInformation("\t    \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));
        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));
        
        String heloWorldLower =  helloWorld.toLowerCase();
        if (heloWorldLower.equals(heloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(heloWorldLower)) {
            System.out.println("Values match ignoring case");
        }

        if (helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        if (helloWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }

        if (helloWorld.contains("World")) {
            System.out.println("String contains World");
        }
        if (heloWorldLower.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }
    }

    public static void printInformation(String string){

        int length = string.length();
        System.out.printf("Length: %d%n", length);

        if (string.isEmpty()){
            System.out.printf("Empty String%n");
            return;
        }

        if (string.isBlank()){
            System.out.printf("Blank String%n");
        }
        System.out.printf("First character: %c%n", string.charAt(0));

        System.out.printf("Last character: %c%n", string.charAt(length - 1));
    }
}
