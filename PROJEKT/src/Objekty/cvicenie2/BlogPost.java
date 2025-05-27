package Objekty.cvicenie2;

public class BlogPost {

    public BlogPost(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    String authorName;
    String title;
    String text;
    String publicationDate;

public void display(){
    System.out.println("Meno autroa : " + authorName);
    System.out.println("Nazov : " + title);
    System.out.println("Popis : " + text);
    System.out.println("Datum vydania : " + publicationDate);
    System.out.println(" ");
}



}
