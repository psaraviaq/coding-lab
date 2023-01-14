//* "import" examples
import { color } from "./exporting.js";
import catSound from "./exporting.js";
//! Incorrect usage
// import { color } from "./exporting";
// import { time } from "./assets";

//* Both default and others
import sound, { number } from "./exporting.js";
//! Incorrect usage
// import { number }, sound from "./exporting.js";

//* Aliases
import { pet as myPet } from "./exporting.js";
//! Incorrect usage
// import Purr as Sound from "./exporting.js"

//* Importing all using "*"
import * as items from "./exporting.js";

//* Importing for side effects only
import "./exporting.js";

/* 



















*/

console.log(color);
catSound();

sound();
console.log(number);

console.log(myPet);

console.log(items);
console.log(items.time);
