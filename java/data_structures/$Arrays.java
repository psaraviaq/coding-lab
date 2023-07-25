import java.util.Arrays;

public class $Arrays {
    //* As an instance variable, it's initialized to null
    static String[] months;

    public static void main(String[] args) {
        System.out.println(months);

        //* First, specify the type of elements and then write []
        //! The elements are enclosed in {} instead of []
        int[] nums = {1, 2, 3, 4, 5};
        //! But you can't use an array without initializing
        // {1, 2, 3, 4, 5};

        //* You can also initialize an array with a specific size
        //* First, specify the type of elements, write [], and then its name
        //* Then type "new", specify the same type of elements, and the size in []
        String[] myStrings = new String[3];
        //* You can also create an array of objects by specifying the class
        MyFavoriteClass[] myClasses = new MyFavoriteClass[2];

        //* You can access the elements of an array using []
        myStrings[0] = "Hello ";
        myStrings[1] = "World";
        myStrings[2] = "!";
        System.out.println(myStrings[0] + myStrings[1] + myStrings[2]);

        //* "length" here works as an instance variable of the array object
        System.out.println(nums.length);

        //! The default "equals" method compares the references of two objects
        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(nums.equals(nums2));
        //* Use the "java.util.Arrays" class and its "equals" method
        System.out.println(Arrays.equals(nums, nums2));
    }
}

class MyFavoriteClass {
    int num;

    void printNum() {
        System.out.println(num);
    }
}