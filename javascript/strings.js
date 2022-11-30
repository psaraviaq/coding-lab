//* include
console.log("The house of cats".includes("house"));

//* __________These methods don't change the original string_________

//* "replace"
let sentence = "    I LIKE when days go like so well";
console.log(sentence.replace(/like/gi, "love"));
console.log(sentence);

//* "slice"
console.log(sentence.slice(0, 6));
console.log(sentence);

//* "split"
console.log(sentence.split(" "));
console.log(sentence);

//* "trim" removes whitespace
console.log(sentence.trim());
console.log(sentence);

//* _________________________________________________________________

//* Regular expressions (RegExp)
const expr1 = /abcd/;
const expr2 = /^abcd$/;
const string = "This is the 'abcd'";

if (expr1.test(string) && !expr2.test(string)) {
  console.log("expr1: 👍, expr2: 👎");
}
