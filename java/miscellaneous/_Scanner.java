package miscellaneous;

import java.util.Scanner;

public class _Scanner {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        //* Create a "Scanner" object to read input from the user
        //* Pass "System.in" as an argument to the constructor
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the password: ");
        //* "next" reads a single word
        //* "nextLine" reads a whole line
        String password = scanner.next();
        // String password = scanner.nextLine();

        System.out.print("Enter the code: ");
        //* "nextInt" reads an integer
        //* "nextDouble" reads a floating-point number
        int code = scanner.nextInt();
        // double code = scanner.nextDouble();

        System.out.println("Password: " + password + ", Code: " + code);

        //* You can optionally close the scanner if you're sure you won't read any more input
        //! But you must close it if you're reading from a file or a network stream
        scanner.close();
    }
}
