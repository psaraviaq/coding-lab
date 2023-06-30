public class Method {
    int num=6;
    
    public static void main(String[] args) {

        //* Void methods don't return any value
        printName("Peter");
        //! When calling a method, you must provide the same number of arguments as there are parameters.
        // printName();

        Method object=new Method();
        //* The variable type must match the method's return type
        int num2=object.doubleNum();
        System.out.println(num2);
    }

    static void printName(String name) {
        System.out.println("Hello " + name + "!");
    }

    int doubleNum() {
        num*=2;
        return num;
    }
}