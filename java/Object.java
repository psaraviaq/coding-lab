public class Object {
    String name;
    int age;

    public static void main(String[] args) {
        //* Create instance of Object
        Object obj1 = new Object();
        obj1.name = "Peter";
        obj1.age = 22;
        System.out.println(obj1.name + " is " + obj1.age + " years old.");

        //* Arrays "[]"
        int[] nums = {1, 2, 3, 4, 5}; //* array of ints
        System.out.println(nums[0]);
        System.out.println(nums.length);

        Object[] objects = new Object[3]; //* array of 3 Objects
        objects[0] = new Object();
        objects[0].name = "My Object";
        System.out.println(objects[0].name);

        //* Use "equals" to compare if two objects are equal
        System.out.println(obj1.name.equals("Peter"));
    }
}