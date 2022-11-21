//* "for" loops
for (var i = 0; i < 4; i++) {
  console.log(i);
}
for (let i = 0, j = 0; i < 5 && j > -4; i++, j--) {
  console.log(i, j);
}

//* "while" loops
var health = 100;
while (health > 0) {
  health -= 20;
  console.log("-20");
}
console.log("Game over");

//* nested loops
for (var year = 2020; year < 2023; year++) {
  for (var month = 10; month <= 12; month++) {
    console.log(`month: ${month}, year: ${year}`);
  }
}
var condition = true;
var countdown = 5;
while (condition) {
  while (countdown > 0) {
    console.log(countdown);
    countdown -= 1;
  }
  console.log("Happy New Year!");
  condition = !condition;
}
