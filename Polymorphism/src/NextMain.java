public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A","Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A","Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C","Airplane");
        Comedy comedyMovie = (Comedy)comedy;
        comedyMovie.watchComedy();

        var airplane = movie.getMovie("C","Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknown = Movie.getMovie("C","Airplane");
        if(unknown.getClass().getSimpleName()=="Comedy"){
            Comedy c = (Comedy)unknown;
            c.watchComedy();
        }
    }
}
