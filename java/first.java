// * Basic Example

// * "public": it can be accessed from anywhere,
// * not required when working in the same package
// * The name must match the filename (compiler rules)
public class first {

  // * "public" is required here
  // * "static": doesn't need to create an instance to run
  // * "void": the method doesn't need to return anything
  // * "String[]" is required, but "args" can be any other name
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }

}
