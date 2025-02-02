//* "for" loops
for (let i = 0; i < 4; i++) {
  console.log(i);
}
//* They can even take more variables, and increments by more than one
// for (let i = 0, j = 0; i < 10 && j > -4; i += 3, j--) {
//   console.log(i, j);
// }

//* The "for...of" loop iterates over its elements
let languages = ["English", "Spanish", "French", "German"];
for (x of languages) {
  console.log("I speak", x);
}

//* "break" / "continue"
// for (let i = 0; i < 10; i++) {
//   if (i === 5) {
//     break;
//   }
//   console.log(i);
// }

//* "while" loops
let health = 100;
while (health > 0) {
  console.log(health);
  health -= 20;
}
console.log("Game over");

//* "do...while" loops
// let i = 0;
// do {
//   console.log(i);
//   i++;
// } while (i < 5);
