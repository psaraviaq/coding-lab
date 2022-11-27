//* Regular expressions (RegExp)
const expr1 = /abcd/;
const expr2 = /^abcd$/;
const string = "This is the 'abcd'";

if (expr1.test(string) && !expr2.test(string)) {
  console.log("expr1: 👍, expr2: 👎");
}
