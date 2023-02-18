console.log("------------------ PROPERTIES ------------------");

//* "textContent" returns the content of all elements inside the node,
//* including also "script" and "style" elements.
const h2 = document.querySelector("h2");
console.log(h2.textContent);
//! "innerText" is similar, but takes into account if it renders,
//! using it also triggers a reflow which can cause performance issues.
console.log(h2.innerText);

//* "innerHTML" returns the HTML contained within an element, it is
//* also a string, therefore it can be modified.
const p_s = document.querySelector("h1+div");
p_s.innerHTML += "<p>This one's an extra paragraph.</p>";
console.log(p_s.innerHTML);

//* "cloneNode" creates a copy, in order to also clone its nested
//* content, it should have "true" as its argument.
const clone_h2 = h2.cloneNode(true);
