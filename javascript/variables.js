// // Initial value is "undefined"
// var myName;
// console.log(myName);

// // But it can be assigned a value later
// var myName = "Pedro";
// console.log("My name is " + myName);

// // Or do both in one go;
// var yourName = "Python";
// console.log("Your name is", yourName);

//~ ES6 introduced the block scope

//* With "let" you can reassign values with but not redeclare the variable.
let color = "red";
// let color;
if (true) {
  let color = "blue";
  console.log(color);
  color = "yellow";
  console.log(color);
}
console.log(color);
//?...
let person;
console.log(person);

//* With "const" you can't reassign nor redeclare.
const age = 13;
if (true) {
  const age = 17;
  console.log(age);
  // age = 20;
}
console.log(age);
//! "const" variables must be assigned a value when declaring them
// const currentJob;
