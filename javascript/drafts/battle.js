// let battleshipLocation = [1, 2, 3];

let randomLocation = Math.floor(Math.random() * 5);

let location1 = randomLocation;
let location2 = randomLocation + 1;
let location3 = randomLocation + 2;

let hits = 0;
let userInput;

let guesses = 0;
let isSunk = false;

while (!isSunk) {
  userInput = Number(prompt("Guess a number:"));
  guesses++;

  if (userInput >= 0 && userInput <= 6) {
    if (userInput === location1) {
      hits++;
      location1 = null;
      alert("HIT");
    } else if (userInput === location2) {
      hits++;
      location2 = null;
      alert("HIT");
    } else if (userInput === location3) {
      hits++;
      location3 = null;
      alert("HIT");
    } else {
      alert("MISS");
    }

    if (hits === 3) {
      isSunk = true;
      alert("SUNK");
    }
  } else {
    alert("Please enter a valid number");
  }
}

alert("Number of guesses: " + guesses);
