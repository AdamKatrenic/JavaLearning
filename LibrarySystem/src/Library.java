import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private String LibraryName;
    private HashMap<Integer,Book> BookList;

    public Library(String LibraryName) {
        this.LibraryName = LibraryName;
        this.BookList = new HashMap<>();
    }

    //Gettery a Settery
    public String getLibraryName() {
        return LibraryName;
    }

    public void setLibraryName(String libraryName) {
        LibraryName = libraryName;
    }

    public HashMap<Integer, Book> getBookList() {
        return BookList;
    }

    public void setBookList(HashMap<Integer, Book> bookList) {
        BookList = bookList;
    }

    //Priadnie knihy do HashMap
    public void addBook(Book book) {
        BookList.put(book.getID(), book);
    }

    //odstránenie knihy podla ID
    public void removeBook(int bookID) {
        BookList.remove(bookID);
    }

    // získanie knihy podľa názvu (tu treba prehľadávať všetky hodnoty)
    public Book getBookByTitle(String bookTitle) {
        for (Book book : BookList.values()) {
            if (book.getTitle().equals(bookTitle)) {
                return book;
            }
        }
        return null;
    }

    public Book getBookByID(int bookID) {
        return BookList.get(bookID);
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryName='" + LibraryName + '\'' +
                ", bookMap=" + BookList +
                '}';
    }
}
