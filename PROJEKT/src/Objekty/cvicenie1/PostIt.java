package Objekty.cvicenie1;

public class PostIt {
//toto je konstruktor po riadok 9... toto samo generuje (nemusim pisat)
    public PostIt(String text, String textColor, String backgroundColor) {
        this.text = text;
        this.textColor = textColor;
        this.backgroundColor = backgroundColor;
    }

    String backgroundColor;
    String text;
    String textColor;

    @Override
    public String toString() {
        return "PostIt{" +
                "backgroundColor='" + backgroundColor + '\'' +
                ", text='" + text + '\'' +
                ", textColor='" + textColor + '\'' +
                '}';
    }
}
