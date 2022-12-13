//* basic if-else condition
var fruit = "apricot";
if (fruit === "apple" || fruit[0] === "a") {
  console.log("it's an apple");
} else {
  console.log("it's not an apple");
}

//* more conditions
var high_score = 90;
if (high_score !== 90) {
  console.log("good");
} else if (high_score === 90 && high_score % 9 !== 0) {
  console.log("bad");
} else {
  console.log("ok");
}

//* "switch" for lots of conditions, the "break" keyword is necessary
//*  for every case in order to stop executing the next cases
var color = "yellow";
switch (color) {
  case "red":
    console.log("not red");
    break;
  case "blue":
    console.log("not blue");
    break;
  case "yellow":
    console.log("not yellow");
    break;
  case "green":
    console.log("not green");
    break;
  default:
    console.log("not a color");
}

//* Ternary operator
var pet = "cat";
var petSound = pet === "cat" ? "meow" : "bark";
console.log(petSound);
