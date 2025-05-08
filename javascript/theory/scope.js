//^ There are 3 types of scope:

//* 1. Global scope
//~ They are accessible from anywhere
let username = "John";
function globalGreet() {
  console.log(`Hello ${username}`);
}
globalGreet();
console.log(`Bye ${username}`);

//* 2. Function scope (local variables)
//~ They are only accessible from inside the function
//& Parameters are also local, they are initialized when the function is called
function localGreet(question) {
  let username = "Kevin";
  console.log(`Hello ${username}, ${question}`);
  //! If you don't declare a variable in a function (var, let or const), it will be global
  // password = "123";
}
localGreet("how are you?");
console.log(`Bye ${username}`);
// console.log(password);

//* 3. Block scope (code between {})
//~ They are only accessible from inside the block
if (true) {
  let username = "Jane";
  console.log(`Hello ${username}`);
  //! Same goes for code blocks, but only for "let" and "const"
  // let password = "123";
}
console.log(`Bye ${username}`);
// console.log(password);
