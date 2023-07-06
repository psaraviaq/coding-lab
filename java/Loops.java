public class Loops {
    public static void main(String[] args) {
        //* Simple for loop (like other languages)
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }

        //* Enhanced for loop (uses an array)
        String[] arr = {"red", "blue", "yellow"};
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
