//* Useful for handling errors
try {
  [2, 3].split();
} catch (err) {
  console.log("This is a TypeError");
}

//! However, it can't handle syntax errors
// try {
//   2+3+
// } catch (err) {
//   console.log("This will never print out")
// }
