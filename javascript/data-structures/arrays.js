//TODO: Add more array methods

//* Examples and methods
var languages = ["english", "portuguese", "spanish", "french"];
console.log(languages.join(" "));

//* "push" adds at the end
languages.push("russian");
console.log(languages.join(" "));

//* "unshift" adds at the beginning
languages.unshift("chinese");
console.log(languages.join(" "));

//* "pop" removes at the end
console.log(languages.pop());
console.log(languages.join(" "));

//* "shift" removes at the beginning
console.log(languages.shift());
console.log(languages.join(" "));
