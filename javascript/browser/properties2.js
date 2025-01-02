console.log("----------------- PROPERTIES 2 -----------------");
const form2 = document.querySelectorAll("form")[1];
const input = form2.querySelector("label input");
const h1 = document.querySelector("h1");

//* input elements and such have special properties
//* like "name" and "value"
//? "checked", "disabled", "placeholder", "required", "multiple", "pattern", not "title", "type", not "role"
console.log(input);
console.log(input.name);
input.value = "Pedro";

//* "id" can be retrieved or modified
console.log(form2.id);

//* "className" returns the classes in a string
console.log(h1.className);

//* "classList" returns the classes in an array, and
//* it has additionally "add" and "remove" methods.
h1.classList.add("heading");
console.log(h1.classList);
h1.classList.remove("heading");
console.log(h1.classList);

//* "style" is an object that contains the CSS styles as properties; and these
//* are written in camelCase because "-" is not allowed in naming variables.
form2.style.backgroundColor = "wheat";

//* "getAttribute" retrieves the value of an attribute
console.log(input.getAttribute("type"));
//* "setAttribute" replaces the value of the attribute
input.setAttribute("name", "username");
//* "hasAttribute" checks if the element has the attribute
console.log(input.hasAttribute("type"), input.hasAttribute("href"));
//* "removeAttribute" removes the attribute
input.setAttribute("class", "info");
console.log(input.hasAttribute("class"));
input.removeAttribute("class");
console.log(input.hasAttribute("class"));
