let sentence = " I love italian food";
console.log("length:", sentence.length);

//* "indexOf" (the first occurrence of a substring)
//~ "lastIndexOf"
console.log(sentence.indexOf("love"));

//* "slice" (returns a part of a string)
//! It can take negative values as well, solving the problem of "substring"
console.log(sentence.slice(0, 10));

//* "toUpperCase" / "toLowerCase" (converts the string to uppercase / lowercase)
console.log(sentence.toUpperCase(), sentence.toLowerCase());

//* "replace" (replaces the first occurrence of a substring)
console.log(sentence.replace("love", "hate"));

//* "split" (divides a string using a separator)
console.log(sentence.split(" "));

//* "trim" (removes whitespace from both ends)
console.log(sentence.trim());

//* "includes"
console.log(sentence.includes("love"));

//* "repeat"
console.log(sentence.repeat(4));
