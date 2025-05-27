public class Main {

    public static void main(String[] args) {

        String helloWorld = "Hello" + "World";
        helloWorld.concat(" and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + "World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStarter = new StringBuilder();
        StringBuilder emptyStart32 = new StringBuilder(32);

        printInformation(emptyStarter);
        printInformation(emptyStart32);
    }

    public static void printInformation(String string){

        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInformation(StringBuilder builder){

        System.out.println("String = " + builder);
        System.out.println("Length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
}
