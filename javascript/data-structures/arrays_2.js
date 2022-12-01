//* __________These methods don't change the original array_________

//* "every"
let arr = [2, 6, 7, 4, -1, 23];
console.log(arr.every((e) => e < 30));

//* "filter"
console.log(arr.filter((e) => !(e % 2)));

//* "find"
console.log(arr.find((e) => e < 0));

//* "includes"
console.log(arr.includes(6));

//* "indexOf"
console.log(arr.indexOf(4), arr.indexOf("number"));

//* "join"
console.log(arr.join(" "));

//* "map"
console.log(arr.map((e) => e * 2));

//* "reduce" has a second argument that is optional
console.log(arr.reduce((accumulator, current) => accumulator + current, 0));

//* "slice"
console.log(arr.slice(0, 3));

//* "some"
console.log(arr.some((e) => !(e % 7)));

//! ___________These methods do mutate the original array___________

//* "reverse"
console.log(arr.reverse());
console.log(arr);

//* "sort"
console.log(arr.sort((a, b) => a - b));
console.log(arr);

//* "splice" doesn't return anything
arr.splice(4);
console.log(arr); //* works like a better "slice"
arr.splice(2, 0, 19);
console.log(arr); //* can also insert elements
arr.splice(1, 3, 27);
console.log(arr); //* and even delete them
