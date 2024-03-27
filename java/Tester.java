//* Main class (tester)
//! In Java, there can be more than one class (or interface) in a file
//! But only one of them can be public and that's the main class
public class Tester {
    
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.title = "Lost in Cubicle Space";
        movie.genre = "Comedy";
        movie.rating = 5;
        System.out.println(movie.title + " is a " + movie.genre + " movie with a rating of " + movie.rating);
        movie.playIt();

        //* Whenever you print an object, the "toString" method from the "Object" class is called
        System.out.println(new Tester());
        //! However, you can override it to print something else
        System.out.println(movie);
    }
    
}

//* Class with variables and methods
class Movie {
    
    //* Variables
    String title;
    String genre;
    int rating;
    
    //* Methods
    void playIt() {
        System.out.println("Playing the movie");
    }

    //* Override the "toString" method
    public String toString() {
        return title;
    }
}
