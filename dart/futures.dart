//* Futures are used to represent a potential value, or error, that will be available at some time in the future

void main() {
  futureCall();
}

//! If somewhere inside the function you use "await", you have to mark the function with "async"
futureCall() async {
  //* Because the function returns a Future<?>, you can use the "then" method
  //* to get the return value of the future's function
  // fetchPost().then((value) {
  // print("The value is: $value");
  // });

  //* But you can also simply use the "await" keyword
  //! If you don't, you'll just get a "Future" object
  final result = await fetchPost();
  print(result);
}

//* You can specify the return type of the future to get auto-completion
Future<String> fetchPost() {
  //* To create a delay, create a "Duration" object
  const delay = Duration(seconds: 3);

  //* To perform the delay, use the "delayed" function from the "Future" class
  //* Pass in a "Duration" object, and a function that returns the value
  return Future.delayed(delay, () {
    return "Hello World!";
  });
}
