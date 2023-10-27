//* Main class (tester)
//! In Java, there can be more than one class (or interface) in a file
//! But only one of them can be public (or not) and that is the main class
public class Tester {
    
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.title = "Lost in Cubicle Space";
        movie.genre = "Comedy";
        movie.rating = 5;
        System.out.println(movie.title + " is a " + movie.genre + " movie with a rating of " + movie.rating);
        movie.playIt();
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
}
