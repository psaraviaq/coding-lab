package miscellaneous;

import java.util.Scanner;

public class _Scanner {

    public static void main(String[] args) {
        //* Create a "Scanner" object to read input from the user
        //* Pass "System.in" as an argument to the constructor
        Scanner scanner = new Scanner(System.in);

        //! Using "print" or "println" depends on whether you want a newline after the prompt
        System.out.print("Enter the password: ");
        //* "nextLine" reads a line of text from the user
        String password= scanner.nextLine();

        System.out.print("Enter the code: ");
        //* "nextInt" is for reading an integer, and there are similar methods for other types 
        int code = scanner.nextInt();

        System.out.println("Password: " + password + ", Code: " + code);

        //* You can optionally close the scanner if you're sure you won't read any more input
        //! But you must close it if you're reading from a file or a network stream
        scanner.close();
    }
}

