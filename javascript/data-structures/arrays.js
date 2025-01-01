let languages = ["english", "spanish", "french"];

//* "push" (adds an element at the end)
languages.push("russian");
console.log("push:", languages);

//* "pop" (removes the last element)
languages.pop();
console.log("pop:", languages);

//* "indexOf" (the first occurrence of an element)
console.log("indexOf:", languages.indexOf("french"));

//* "concat" (adds multiple elements by passing an array)
console.log("concat:", languages.concat(["german", "japanese"]));

//* "includes" (checks if an element is present)
console.log("includes:", languages.includes("english"));

//* "sort" (orders the elements)
languages.sort();
console.log("sort:", languages);

//* "reverse" (inverts the order)
languages.reverse();
console.log("reverse:", languages);

//* "slice" (returns a part of the array)
console.log("slice:", languages.slice(-2));

//* "join" (converts the array to a string using a separator)
//! The default separator is a comma ","
console.log("join:", languages.join());
