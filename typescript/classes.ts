import { Person } from "./interfaces";

//* A class can implement an interface
//! But it is not that common to do so
class User implements Person {
  name: string;
  age: number;

  constructor(name: string, age: number) {
    this.name = name;
    this.age = age;
  }

  greet() {
    console.log("Hello, I'm " + this.name);
  }
}

const user: User = new User("Faye", 32);
user.greet();
