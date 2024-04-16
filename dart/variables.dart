void main() {
  //* Use the "var" keyword to declare a variable
  var name = "John";
  //! However, you can't change the type of the variable
  // name = 10;

  //* You can use "const" to make the variable immutable
  const age = 20;
  // age = 21;

  //* "final" is recommended instead for compile-time constants
  // final country;

  //* You can use "$" to interpolate variables in strings
  print("My name is $name and I am $age years old.");

  //* You can also specify the type of the variable
  // int population = 8_623_000;
  // bool isCapital = false;
  // double area = 468.9;
  // String city = "New York";
  //! Strings can also be declared using single quotes
  // String city = 'Austin';

  //! To use variables without initializing them, add the "?" operator
  String? course;
  print(course);
}
