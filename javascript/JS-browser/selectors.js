console.log("------------------ SELECTORS ------------------");
//! NodeJS doesn't support the DOM

//* These selectors are not exclusive to "document", they also
//* work for other elements, they just search inside them.

//* "getElementById" is an ID selector, outputs null if not found
const unique = document.getElementById("p-unique");
console.log(unique);

//* "getElementsByClassName" is a class selector, it always returns
//* an HTMLCollection, similar to an array (indexes, length)
const titles = document.getElementsByClassName("title");
console.log(titles);
//! It doesn't share the array methods, you have to transform it
//! using either "Array.from" or the spread operator
console.log(Array.isArray(titles));

//* "getElementsByTagName" is an element selector
const steps = document.getElementsByTagName("li");
console.log(steps.length);

//* "querySelector" uses a raw CSS selector for only one element
const important = document.querySelector("ul li.main");
console.log(important);

//* "querySelectorALL" outputs all matches, it always returns
//* a NodeList, also similar to an array
const div_children = document.querySelectorAll(".title + div p");
console.log(div_children);

//* You can also use "forms" to just select those.
const forms = document.forms;
console.log(forms);
