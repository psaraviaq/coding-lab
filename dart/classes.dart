void main() {
  //* You don't need the "new" keyword to create an object
  var user = User("John", 21);

  //* When printing the properties of an object in a string, use "{}" to access them
  print("${user.name} is ${user.age} years old");

  var worker = Worker("Developer", "Jane", 25);
  print("${worker.name} - ${worker.age} years old - ${worker.job}");

  print("User: $user");
}

class User {
  String name;
  int age;

  //* You can directly assign the properties in the constructor by using "this." in the parameters
  //! Add a semicolon after the constructor in this case
  User(this.name, this.age);

  //* You can use the "@override" annotation when overriding a method
  @override
  String toString() {
    return name;
  }
}

class Worker extends User {
  String job;

  //* You can also assign the properties to the parent class by using "super" after the constructor
  // Worker(this.job, String name, int age) : super(name, age);
  //* But a more efficient way is to directly use "super." in the parameters
  Worker(this.job, super.name, super.age);
}
