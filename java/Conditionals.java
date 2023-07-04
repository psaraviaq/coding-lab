public class Conditionals {
    public static void main(String[] args) {
        //* If statement
        int num1 = 5;
        if (num1 > 0) {
            System.out.println("Positive");
        } else if (num1 < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        //* Ternary operator
        int num2 = 7;
        String result = (num2 % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
