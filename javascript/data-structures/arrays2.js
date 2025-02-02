//* "every"
let arr = [2, 6, 7, 4, -1, 23];
console.log(arr.every((e) => e < 30));

//* "filter"
console.log(arr.filter((e) => !(e % 2)));

//* "find"
console.log(arr.find((e) => e < 0));

//* "map"
console.log(arr.map((e) => e * 2));

//* "reduce" has a second argument that is optional
console.log(arr.reduce((accumulator, current) => accumulator + current, 0));

//* "some"
console.log(arr.some((e) => !(e % 7)));

//* "splice" doesn't return anything
arr.splice(4);
console.log(arr); //* works like a better "slice"
arr.splice(2, 0, 19);
console.log(arr); //* can also insert elements
arr.splice(1, 3, 27);
console.log(arr); //* and even delete them

//* Destructuring
const [fruit, , user, number] = ["apple", 10, "Pedro"];
console.log(`${user} eats ${number} ${fruit}s`);

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
