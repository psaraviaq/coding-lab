console.log("------------------ TRAVERSING ------------------");
const main_item = document.querySelector(".main");
const container = document.querySelector("h1+div");

//* "parentNode" / "parentElement"
console.log(main_item.parentNode);
console.log(main_item.parentElement);

//* "children" returns the elements inside of it
console.log(container.children);
//! "childNodes" also returns line breaks, comments, etc.
console.log(container.childNodes);

//* (previous/next)ElementSibling returns an element
console.log(container.previousElementSibling);
console.log(main_item.nextElementSibling);
//! (previous/next)Sibling has more options
console.log(container.previousSibling);
console.log(main_item.nextSibling);
