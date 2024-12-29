let languages = ["english", "spanish", "french"];

//* "push" adds at the end
languages.push("russian");
console.log("push:", languages);

//* "pop" removes at the end
languages.pop();
console.log("pop:", languages);

//* "indexOf"
console.log("indexOf:", languages.indexOf("french"));

//* "concat"
console.log("concat:", languages.concat(["german", "japanese"]));

//* "includes"
console.log("includes:", languages.includes("english"));

//* "sort"
languages.sort();
console.log("sort:", languages);

//* "reverse"
languages.reverse();
console.log("reverse:", languages);

//* "slice"
console.log("slice:", languages.slice(-2));

//* "join"
console.log("join:", languages.join());
