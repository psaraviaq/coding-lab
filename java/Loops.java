public class Loops {
    public static void main(String[] args) {
        //* Simple "for" loop
        for (int i = 1; i < 4; i++) {
            System.out.println(i);
        }
        
        //* Enhanced "for" loop (uses an array)
        String[] arr = {"red", "blue", "yellow"};
        //* First goes the element type, then its variable name, then the array after a colon
        for (String color : arr) {
            System.out.println(color);
        }
        
        //* While loop
        int i = 3;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }
}
