//* Basic use of "export"
export const number = 17;
export function greeting() {
  console.log("Hi World!");
}
//! Incorrect use of "export"
// export color = "red";
// export myFunction;

//* Using the "default" keyword
export default function catSound() {
  console.log("Meow");
}
// function f1() {}
//   export default f1;
// var grade;
//   export default grade = 10;
// export default "Starbucks";
//! Incorrect use of "default"
// export default const country = "Peru";
// export default language = "spanish";

//* Exporting as properties
var color = "red";
function sayIt(it) {
  console.log(it);
}
export { color, sayIt };
//! Incorrect usage
// export { day: 32 };

//* Exporting properties with destructuring
export const [season, hot] = ["summer", true];
export const { pet } = { pet: "cat" };
//! Incorrect usage
// export [] = [];
// export {} = {};

//* Aliases
let emotion = "excited";
export { emotion as feeling };

//* Exporting from other files
export { time } from "./assets/index.js";
export * from "./assets/index.js";
//! Incorrect usage (with script type module)
// export { time } from "./assets";
// export { time } from "./assets/index";
