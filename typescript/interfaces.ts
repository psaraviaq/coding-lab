//* An interface defines the structure of an object in terms of properties and methods
//* It is a way to define a contract in your code and ensure that the objects you use have the same properties and methods.
//! Use "?" to make a property optional
interface Person {
  name: string;
  age: number;
  address?: string;
  greet: () => void;
  // greet(): void;
}

//* You can assign the interface to an object
const user: Person = {
  name: "Faye",
  age: 32,
  greet() {
    console.log("Hello, I'm " + this.name);
  },
};

user.greet();

export { Person };
