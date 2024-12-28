//? What if nothing is assigned to a variable?
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
let favoriteColor = "red";
// let favoriteColor;
if (true) {
  let favoriteColor = "blue";
  console.log(favoriteColor);
  favoriteColor = "yellow";
  console.log(favoriteColor);
}
console.log(favoriteColor);

//* With "const" you can't reassign nor redeclare.
const AGE = 13;
if (true) {
  const AGE = 17;
  console.log(AGE);
  // AGE = 20;
}
console.log(AGE);
//! "const" variables must be assigned a value when declaring them
// const RADIUS;
