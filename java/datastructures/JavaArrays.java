package datastructures;

public class JavaArrays {
    
    public static void main(String[] args) {
        
        //* First, specify the type of elements and then write []
        //! The elements are enclosed in {} instead of []
        int[] nums = {1, 2, 3, 4, 5};
        //! You can't use an array without initializing
        // System.out.println({1, 2, 3, 4, 5});
        
        //* You can also initialize an array with a specific size
        //* Use "new", then specify the same type of elements, and the size inside []
        String[] myStrings = new String[3];
        //* You can also create an array of objects
        // RandomClass[] classes = new RandomClass[2];
        
        //* You can access the elements of an array using []
        myStrings[0] = "Hello ";
        myStrings[1] = "World!";
        System.out.println(myStrings[0] + myStrings[1]);
        //! But printing the array itself will return its reference
        System.out.println(myStrings);
        
        //* For arrays, length works as an instance variable instead of a method
        System.out.println(nums.length);
    }
}