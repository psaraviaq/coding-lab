// comment
/*
also
a
comment
*/

//* Note
//*? What to do
//*! Warning !!!
//*TODO: Do that

console.log("Hello World!"); // inline comment

//* Using a variable from the console
var rl = require("readline/promises").createInterface({
  input: process.stdin,
  output: process.stdout,
});
(async function () {
  var greet = await rl.question("Type a greeting: ");
  console.log(`${greet} Pedro!`);
  rl.close();
})();
