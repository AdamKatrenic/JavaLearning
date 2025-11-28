public class Book {

    private String title;
    private String author;
    private String dateOfPublication;
    private int ID;

    public Book() {
    }

    public Book(String title, String author, String dateOfPublication, int ID) {
        this.title = title;
        this.author = author;
        this.dateOfPublication = dateOfPublication;
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(String dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", dateOfPublication='" + dateOfPublication + '\'' +
                ", ID=" + ID +
                '}';
    }


}
