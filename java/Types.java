public class Types {
    public static void main(String[] args) {
        numbers();
        strings();
        booleans();
        defaults();
    }
    
    //* Numbers
    static void numbers() {
        //* byte, short, int, long (ends in "l" or "L")
        byte num1 = 127;
        short num2 = 32767;
        int num3 = 2147483647;
        long num4 = 2000630001000L;
        System.out.println("byte: " + num1 + ", short: " + num2 + ", int: " + num3 + ", long: " + num4 + "L");
        
        //* float, double (by default, all decimals are doubles)
        //! "f" is required for floats and "d" is optional for doubles
        float num6 = 21.25f;
        double num7 = 2435.2323354354353d;
        System.out.println("float: " + num6 + "f, double: " + num7 + "d");
    }
    
    //* Strings
    static void strings() {
        //* char (only one character and single quotes)
        char letter = 'f';
        //* String (zero or more characters and double quotes)
        String word = "java";
        System.out.println("char: '" + letter + "', String: \"" + word + "\"");
    }
    
    //* Booleans
    static void booleans() {
        //* true, false
        boolean fact1 = true;
        boolean fact2 = false;
        System.out.println("boolean: " + fact1 + " or " + fact2);
    }
    
    //* Default values of class and instance variables:
    static int default1;
    static double default2;
    static boolean default3;
    static String default4;
    
    static void defaults() {
        System.out.println("\n--- Default Values ---");
        //* byte, short, int, long: 0
        //* float, double: 0.0
        System.out.println("numbers: " + default1 + ", " + default2);
        //* boolean: false
        System.out.println("booleans: " + default3);
        //* String: null (because it's an object)
        System.out.println("strings: " + default4);
        
        //! Unassigned values can't be used inside methods
        // int num5;
        // System.out.println(num5);
    }
}
