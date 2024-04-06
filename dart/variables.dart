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
}
