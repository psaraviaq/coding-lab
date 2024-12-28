let languages = ["english", "spanish", "french"];

//* "push" adds at the end
languages.push("russian");
console.log("push:", languages);

//* "pop" removes at the end
languages.pop();
console.log("pop:", languages);

//* "sort"
languages.sort();
console.log("sort:", languages);

//* "reverse"
languages.reverse();
console.log("reverse:", languages);

//* "indexOf"
console.log("indexOf:", languages.indexOf("french"));

//* "includes"
console.log("includes:", languages.includes("english"));

//* "join"
console.log("join:", languages.join());

//* "slice"
console.log("slice:", languages.slice(-2));
