//* Initial value is "undefined"
var myName;
console.log(myName);

//* But it can be assigned a value later
var myName = "Pedro";
console.log("My name is " + myName);

//* Or do both in one go;
var yourName = "Python";
console.log("Your name is", yourName);

//* ES6 introduced the block scope
//* Can assign different values with "let" but not re-declaring it
let color = "red";
if (true) {
  let color = "blue";
  console.log(color);
  color = "yellow";
  console.log(color);
}
console.log(color);

//*Can't assign nor re-declare with "const"
const age = 13;
if (true) {
  const age = 17;
  console.log(age);
}
console.log(age);
//! "const" variables must be assigned a value when declaring them
// const currentJob;
