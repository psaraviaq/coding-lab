public class Conditionals {
    public static void main(String[] args) {
        //* "If" statement
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
        
        //* "Switch" statement
        String language = "Java";
        switch (language) {
            case "Java":
                System.out.println("Java is a compiled language");
                break;
            case "Python":
                System.out.println("Python is an interpreted language");
                break;
            default:
                System.out.println("I don't know that language");
        }
        
        //* Enhanced "switch" statement (cases don't require "break")
        String language2 = "Python";
        switch (language2) {
            case "Java" -> System.out.println("Java is a compiled language");
            case "Python" -> System.out.println("Python is an interpreted language");
            default -> System.out.println("I don't know that language");
        }
    }
}
