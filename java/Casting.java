public class Casting {
    public static void main(String[] args) {
        numbers();
    }

    static void numbers() {
        //* If you need to use decimals variables in an int, you need to cast them
        double d = 35.25;
        int i = (int) d;
        System.out.println("The casted int value is " + i);
    }
}
