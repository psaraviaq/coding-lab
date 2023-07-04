public class Numbers {
    public static void main(String[] args) {

        //! When working with division, and you want a decimal, you need to use a float
        //! Otherwise, it will only return the whole number
        int num1 = 5 / 2;
        float num2 = 5f / 2;
        System.out.println(num1 + ", " + num2);

        //* You can combine numbers with Strings using the + operator
        String word = "java " + 17.0;
        System.out.println(word);

    }
}
