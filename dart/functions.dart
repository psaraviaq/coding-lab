void main() {
  print(greet("John"));

  //* With named parameters, you can pass the arguments in any order
  print(greet2(age: 20, name: "Peter"));
  //! But you must specify the name of the argument
  // print(greet2("Peter", 20));

  //* You can omit the parameters with "?"
  print(greet3(age: 20));
  //! But you must provide the required parameters
  // print(greet3());
}

//* Return and parameter types are optional
greet(name) {
  return "Hello $name";
}

//* To use named parameters, use curly braces
greet2({name, age}) {
  return "Hello $name, you are $age years old";
}

//! But if you specify the type of the named parameters
//! You must either mark them as required or use the "?" operator
greet3({String? name, required int age}) {
  return "Hello $name, you are $age years old";
}
