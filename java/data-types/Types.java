class Types {
  public static void main(String[] args) {
    numbers();
    defaults();
  }

  // * Numbers
  static void numbers() {
    // * byte, short, int, long (ends in "l" or "L")
    byte num1 = 127;
    short num2 = 32767;
    int num3 = 2147483647;
    long num4 = 2000630001000L;
    System.out.println("byte: " + num1 + ", short: " + num2 + ", int: " + num3 + ", long: " + num4);
    // ! Unassigned values can't be used inside methods
    // int num5;
    // System.out.println(num5);

    // * float, double
    float num6 = 21.25f;
    double num7 = 2435.2323354354353;
    System.out.println("float: " + num6 + ", double: " + num7);
  }

  // * Default values:
  static int def1;
  static float def2;
  static double def3;

  static void defaults() {
    // * byte, short, int, long: 0
    System.out.println(def1);
    // * float, double: 0.0
    System.out.println(def2 + " " + def3);
  }
}

