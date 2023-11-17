//* Methods can have parameters and return values
public class Method {
    
    //! You must include the types of both the parameters and the return value
    static int doubleNumber(int num) {
        
        num *= 2;
        return num;
    }
    
    //* If a method doesn't return anything, its return type is "void"
    static void printName(String name) {
        
        System.out.println("Hello " + name + "!");
    }
    
    public static void main(String[] args) {
        int num = doubleNumber(2);
        System.out.println(num);
        printName("Peter");
    }
}