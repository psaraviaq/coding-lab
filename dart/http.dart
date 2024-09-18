//* Import the "http" package to use the "http" class.
//! You have to add this package to the "pubspec.yaml" file.
import "package:http/http.dart" as http;

//* Import the "convert" package to decode the JSON response.
//! This package is built-in, so you don't have to do anything.
import "dart:convert" as convert;

void main() async {
  //! You have to wait for the future to complete before you can access the data.
  final data = await fetchPost();
  print(data.keys);
}

//! Don't forget "async" as well.
fetchPost() async {
  //* The "Uri" class is used to create a URL object from a string with the "https" method.
  //* It takes the base URL and the path as arguments.
  var url = Uri.https("jsonplaceholder.typicode.com", "/posts/1");

  //* To perform a request, use the "http" class (which you have to import)
  //* Use the "get" method to perform a GET request with the URL object as an argument.
  //! Don't forget to use the "await" keyword to wait for the actual response.
  final response = await http.get(url);

  //* The response has a "body" property that contains the data returned by the server.
  //! But you can't just access the key-value pairs directly because it's a JSON string.
  print(response.body);

  //* In order to access the properties, you have to use the "convert" class with the "jsonDecode" method.
  //* Pass the body of the response as an argument, then the method converts it to a map.
  //* It's a good practice to specify the types as "String" and "dynamic"
  Map<String, dynamic> data = convert.jsonDecode(response.body);

  //* Then you can access the properties of the map.
  print(data["userId"]);

  return data;
}
