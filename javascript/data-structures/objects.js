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

//* ES6 features

//* Destructuring
const { age, job } = person;
console.log("age:", age, "- job:", job);
