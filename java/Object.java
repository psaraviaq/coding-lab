class Movie {
  // * Instance variables */
  String title;
  String genre;
  int rating;

  // * Methods */
  void playIt() {
    System.out.println("Playing the movie");
  }
}

// * Movie Tester */
public class Object {

  public static void main(String[] args) {
    Movie movie = new Movie();
    movie.title = "Lost in Cubicle Space";
    movie.genre = "Comedy";
    movie.rating = 5;
    movie.playIt();
  }
}