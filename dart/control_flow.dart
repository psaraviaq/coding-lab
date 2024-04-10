void main() {
  //* If-else statements are used to execute code based on a condition
  var age = 18;
  if (age >= 18) {
    print("You are an adult");
  } else {
    print("You are a minor");
  }

  //* Loops are used to execute code multiple times
  for (var i = 0; i < 5; i++) {
    print(i);
  }

  //* You can also iterate over lists and sets
  List<String> names = ["Alice", "Bob", "Charlie"];
  for (var name in names) {
    print(name);
  }
}
