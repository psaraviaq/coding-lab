var languages = ["english", "spanish", "french"];

//* Checks if it's actually an array
console.log(Array.isArray(languages));
console.log(languages);

//* "push" adds at the end
languages.push("russian");
console.log(languages);

//* "pop" removes at the end
console.log(languages.pop());
console.log(languages);

//* "unshift" adds at the beginning
languages.unshift("chinese");
console.log(languages);

//* "shift" removes at the beginning
console.log(languages.shift());
console.log(languages);

//* "from" creates an array
console.log(Array.from({ length: 5 }, (_, i) => i));

//* __________________________ ES6 features _____________________________

//* Destructuring
const [fruit, , user, number] = ["apple", 10, "Pedro"];
console.log(`${user} eats ${number} ${fruit}s`);

//* The "for...of" loop iterates over its elements
for (x of languages) {
  console.log("I speak", x);
}

//* Spread operator "..." (useful for concatenating and cloning)
let numbers = [2, 3, 4];
numbers = [1, ...numbers, 5];
console.log(numbers);

const myPets = ["cat", "dog"];
const yourPets = [...myPets];
yourPets.pop();
console.log("I:", myPets, "You:", yourPets);

//* Rest operator "..." (condenses elements into a single element)
const [a, b, ...c] = [1, 2, 3, 4, 5];
console.log(a, b, c);
