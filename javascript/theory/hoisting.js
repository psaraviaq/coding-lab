//* "hoisting" is a JavaScript mechanism where variables and function declarations are moved to the top of their containing scope during the compilation phase.

//* With functions, it only works with declarations.
eat();
function eat() {
  console.log("Eating food");
}

// drink();
// let drink = function () {
//   console.log("Drinking water");
// };
