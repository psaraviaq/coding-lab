//* Basic use of "export"
export const number = 17;
export function greeting() {
  console.log("Hi World!");
}
//! Incorrect use of "export"
// export color = "red";
// export myFunction;

//* Using the "default" keyword
export default function catSound() {
  console.log("Meow");
}
// function f1() {}
//   export default f1;
// var grade;
//   export default grade = 10;
// export default "Starbucks";
//! Incorrect use of "default"
// export default const country = "Peru";
// export default language = "spanish";
