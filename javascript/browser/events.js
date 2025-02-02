const list = document.querySelector("ul");

//* Use "addEventListener" to add event handlers to elements (1° event, 2° callback)
list.addEventListener("click", (e) => {
  //* The callback's argument is the event itself
  console.log(e);

  //* "target" is the element that triggered the event,
  //* "currentTarget" is the one the listener is attached to.
  console.log(e.target, e.currentTarget);

  //* "preventDefault" is a method that when called, its default action won't be taken;
  //* it goes at the beginning of the callback.
  e.preventDefault();

  // ? e.clientX, e.clientY
  //? e.altKey, e.ctrlKey, e.shiftKey
});

//* When nested elements have events, they "bubble up" from the innermost element.
const pu = document.getElementById("p-unique");
const div = pu.parentNode;

pu.addEventListener("click", () => {
  console.log("first");
});
div.addEventListener("click", () => {
  console.log("second");
});

//? document.addEventListener("DOMContentLoaded")
