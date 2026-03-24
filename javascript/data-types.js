//* There are 7 primitive data types in Javascript
//^ Use "typeof" to check the data type

//* 1) Number
console.log(typeof 2);

//* 2) String
console.log(typeof "It's me");

//* 3) Boolean
console.log(typeof true);

//* 4) Null (absence of value)
//! Using "typeof" will cause a bug that is only being kept for legacy reasons
console.log(typeof null);

//* 5) Undefined (a variable that has been declared but not assigned a value)
//! Although you can still assign a variable to undefined
let noValue;
console.log(noValue);

//! These last two were just introduced in ES6
//* 6) BigInt
let bigNumber = BigInt(3);
console.log(typeof bigNumber);

//? 7) Symbol
let sym = Symbol();
console.log(typeof sym);

//* __________________________Falsy Values_________________________
console.log("0:", !!0);
console.log("'':", !!"");
console.log("undefined:", !!undefined);
console.log("null:", !!null);
console.log("NaN:", !!NaN);
//! These are actually truthy values
console.log("[]", !![]);
console.log("{}", !!{});

//* __________________________Type Conversion_________________________
console.log("Number('10'):", Number("10"));
console.log("String(['a', 'b', 'c']):", String(["a", "b", "c"]));
console.log("Boolean({}):", Boolean({}));
