//* "import" examples
import { color } from "./exporting.js";
import catSound from "./exporting.js";
//! Incorrect usage
// import { color } from "./exporting";

//* Both default and others
import sound, { number } from "./exporting.js";
//! Incorrect usage
// import { number }, sound from "./exporting.js";

//* Aliases
import { pet as myPet } from "./exporting.js";
//! Incorrect usage
// import Purr as Sound from "./exporting.js"

/* 



















*/

console.log(color);
catSound();

sound();
console.log(number);

console.log(myPet);
