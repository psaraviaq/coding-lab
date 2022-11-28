//* a basic "object"
var person = {
  name: "Pedro",
  age: 22,
  pets: ["cat"],
  greeting() {
    console.log(`Hi, my name is ${this.name}`);
  },
};

//* properties and methods
console.log(person.pets);
console.log(person["name"]);
person.greeting();

//* __________________________ ES6 features _____________________________

//* Destructuring
const { age, job } = person;
console.log("age:", age, "- job:", job);

//! 'for...in' iterates over the object and its prototype
//* 'for...of' only iterates over its own properties, but needs an array
console.log("Person:");
for (key of Object.keys(person)) {
  console.log(`${key}: ${person[key]}`);
}

//* Spread operator "..." (useful for merging and cloning)
const english_1 = { country: "Canada", city: "London" };
const english_2 = { country: "UK", dish: "fish and chips" };
console.log({ ...english_1, ...english_2 });

const car1 = { color: "red", fast: true };
const car2 = { ...car1 };
car2.color = "blue";
console.log(car1, car2);
