//* simple function
function factorial(n) {
  if (n === 0) return 1;
  return n * factorial(n - 1);
}
console.log(factorial(6));

//* "arguments" keyword
function totalSum() {
  console.log(arguments);
  var sum = 0;
  for (var i = 0; i < arguments.length; i++) {
    sum += arguments[i];
  }
  return sum;
}
console.log(totalSum(2, 6, 1, 5));

//* __________________________ ES6 features _____________________________

//* Default parameters
function noParams(number = 10) {
  return number * 9;
}
console.log(noParams());

//* Arrow functions
console.log(((x) => x * x)(25));

const greet = () => ({ greeting: "hello" });
console.log(greet());

//* Spread operator "..." (expands array into its elements)
const numbers = [3, 17, 2, 9, 23, 5, 14];
function myFunction(x, y, z, w) {
  console.log(`x: ${x}, y: ${y}, z: ${z}, w: ${w}`);
}
myFunction(...numbers);

//* Rest operator "..." (condenses elements into a single element)
function speak(person, ...languages) {
  console.log(languages);
  for (x of languages) {
    console.log(`${person} speaks ${x}`);
  }
}
speak("Pedro", "english", "spanish", "french");
