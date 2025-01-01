//* When a variable is declared but not assigned a value, it's value is "undefined"
var month;
console.log(month);
var month = "august";
console.log(month);
//! However with "var", variables declared in a block scope can be accessed outside of it
if (true) {
  var year = 2024;
}
console.log(year);

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
