// * Real class
class Movie {

    // * Variables
    String title;
    String genre;
    int rating;

    // * Methods
    void playIt() {
        System.out.println("Playing the movie");
    }
}


// * Tester class
public class Tester {

    // * The main method here will test the real class
    public static void main(String[] args) {

        // * An instance of the real class is created
        Movie movie = new Movie();
        System.out.println(movie.genre);

        // * Then we assign values to the variables of the object
        movie.title = "Lost in Cubicle Space";
        movie.genre = "Comedy";
        movie.rating = 5;
        System.out.println(movie.genre);

        // * We can also call its methods
        movie.playIt();
    }
}
