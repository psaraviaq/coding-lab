//* Examples
const set1 = new Set([2, 4, 4, 1, 3, 7, 2]);
const set2 = new Set("array");
console.log(set1);
console.log(set2);

//* Can access their values using a "for...of" loop
console.log(set1[2]);
for (x of set1) {
  console.log(x);
}

//* Can transform them into arrays
console.log([...set1]);
console.log(Array.from(set2));
