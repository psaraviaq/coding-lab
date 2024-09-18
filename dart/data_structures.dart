void main() {
  //* Lists are created using square brackets
  var scores = [20, 8, 15, 13, "Hello"];
  //* But you can also use the "List" class to specify the type
  // List<int> grades = [20, 8, 15, 13];
  //* You can access and modify elements using the index
  print(scores[0]); // 20
  scores[0] = 10;
  print(scores);
  //* "length", "add", "remove", "removeLast", "indexOf", "shuffle"
  print(scores.length);
  scores.add(30);
  scores.remove(15);
  scores.removeLast();
  print(scores.indexOf(13));
  scores.shuffle();
  print(scores);

  //* Sets are created using curly brackets
  var unique = {1, 2, 3, 4, 5};
  //* You can use the "Set" class to specify the type
  // Set<int> unique = {1, 2, 3, 4, 5};
  //* You can use most of the same methods as lists
  unique.add(3);
  print(unique);

  //* Maps are created using curly brackets with key-value pairs
  //* You can as well use the "Map" class to specify the types
  var person = {
    "name": "Alice",
    "age": 25,
    "isStudent": false,
  };
  //* You can easily access and modify elements by using the key
  print(person["name"]);
  person["name"] = "Bob";
  //* You can add new key-value pairs with ease
  person["height"] = 1.75;
  //* And remove them
  person.remove("isStudent");
  print(person);

  //* You also have iterators
  unique.where((e) => e > 4).forEach(print);
}
