//* Function declaration
function greet() {
  console.log("Hello");
}
greet();

//* Function expression
let speak = function () {
  console.log("Hello");
};
speak();

//* IIFE (Immediately Invoked Function Expression)
(function () {
  console.log("Hello");
})();

//^ In functions, "pass-by-value" is used with primitive data types
//^ This means the argument is copied into the function, so the original value isn't changed
let number = 27;
function add(number) {
  number += 1;
}
console.log(number);

//* "arguments" is used to access the arguments passed to a function
//! Even if the parameters are not defined
function sum() {
  // console.log(arguments);
  let sum = 0;
  for (let i = 0; i < arguments.length; i++) {
    sum += arguments[i];
  }
  return sum;
}
console.log(sum(1, 2, 3, 4));

//* Default parameters
function noParams(number = 10) {
  return number * 9;
}
console.log(noParams());

//* Arrow functions
const multiply = (x, y) => {
  return x * y;
};
console.log(multiply(5, 15));

const double = (x) => x * 2;
console.log(double(7));

//^ A callback function is a function passed as an argument to another function
function welcomeMessage(name, callback) {
  const message = callback(name);
  console.log(message);
}
function greet(name) {
  return `Hello ${name}`;
}
function goodbye(name) {
  return `Goodbye ${name}`;
}
welcomeMessage("Pedro", greet);
welcomeMessage("Pedro", goodbye);

//* Spread operator "..." (expands array into its elements)
const numbers = [3, 17, 2, 9, 23, 5, 14];
function myFunction(x, y, z, w) {
  console.log(`x: ${x}, y: ${y}, z: ${z}, w: ${w}`);
}
myFunction(...numbers);

//* Rest operator "..." (condenses elements into a single element)
// function speak(person, ...languages) {
//   console.log(languages);
//   for (x of languages) {
//     console.log(`${person} speaks ${x}`);
//   }
// }
// speak("Pedro", "english", "spanish", "french");
