class Types {
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
        System.out.println("byte: " + num1 + ", short: " + num2 + ", int: " + num3 + ", long: " + num4);
        //! Unassigned values can't be used inside methods
        // int num5;
        // System.out.println(num5);

        //* float, double
        float num6 = 21.25f;
        double num7 = 2435.2323354354353;
        System.out.println("float: " + num6 + ", double: " + num7);
    }

    //* Strings
    static void strings() {
        //* char (only one character)
        //! only single quotes, mutable
        //! concatenating with another char will sum their unicode values
        //! concatenating with a String will convert it into that
        char letter = 'f';
        //* String (more than one)
        //! only double quotes, immutable
        String word = "java";
        System.out.println("char: " + letter + ", String: " + word);
    }

    //* Booleans
    static void booleans() {
        //* true, false
        boolean fact1 = true;
        boolean fact2 = false;
        System.out.println("boolean: " + fact1 + " or " + fact2);
    }

    //* Default values of instance variables:
    static int def1;
    static float def2;
    static double def3;
    static char def4;
    static String def5;
    static boolean def6;

    static void defaults() {
        System.out.println("--- Default Values ---");
        //* byte, short, int, long: 0
        System.out.println(def1);
        //* float, double: 0.0
        System.out.println(def2 + " " + def3);
        //* char: nothing, String: null
        System.out.println(def4);
        System.out.println(def5);
        //* boolean: false
        System.out.println(def6);
    }
}
