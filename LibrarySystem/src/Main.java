public class Main {

    public static void main(String[] args) {
        Library lib = new Library("Kniznica");

        Book book1 = new Book("Kocurkovo", "Adam Katrenič", "19.8.2002", 1);
        Book book2 = new Book("Macky", "Adam Katrenič", "11.2.2022", 2);

        lib.addBook(book1);
        lib.addBook(book2);

        // vyhľadanie podľa názvu
        System.out.println(lib.getBookByTitle("Macky"));
        System.out.println(lib.getBookByTitle("Kocurkovo"));

        //Vyhľadanie podľa ID
        System.out.println(lib.getBookByID(1));
        System.out.println(lib.getBookByID(2));
        System.out.println(lib.getBookByID(2));
        System.out.println(lib.getBookByID(2));
        System.out.println(lib.getBookByID(1));
    }
}
