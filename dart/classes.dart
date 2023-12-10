void main() {
  //* You don't need to use "new" to create an object
  User user = User("John");

  print(user.name);
}

class User {
  //! If the variable can be null, you need to add a question mark
  String? name;

  User(String name) {
    this.name = name;
  }
}
