//* There are 7 primitive data types in Javascript

//* 1) Number
console.log(typeof 2);

//* 2) String
console.log(typeof "It's me"); // single or double quotes
console.log(typeof `Tch`);
console.log("wow".length); // 'length' is a property

//* 3) Boolean
console.log(typeof true);
console.log(typeof false);

//! 4) Null (using "typeof" will cause a Javascript bug)
console.log(typeof null);

//* 5) Undefined
var noValue;
console.log(noValue);

//* These last two were just introduced in ES6
//* 6) BigInt
var bigNumber = BigInt(3);
console.log(typeof bigNumber);

//? 7) Symbol (I don't know much about this type)
var sym = Symbol();
console.log(typeof sym);
