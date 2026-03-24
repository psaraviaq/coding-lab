console.log("------------------ PROPERTIES ------------------");
const h2 = document.querySelector("h2");
const p_s = document.querySelector("h1+div");

//* "textContent" returns the content of all elements inside the node,
//* including also "script" and "style" elements.
console.log(h2.textContent);
//! "innerText" is similar, but takes into account if it renders,
//! using it also triggers a reflow which can cause performance issues.
console.log(h2.innerText);

//* "innerHTML" returns the HTML contained within an element, it is
//* also a string, therefore it can be modified.
p_s.innerHTML += "<p>This one's an extra paragraph.</p>";
console.log(p_s.innerHTML);

//* "cloneNode" creates a copy, in order to also clone its nested
//* content, it should have "true" as its argument.
const clone_h2 = h2.cloneNode(true);

//* "createElement" creates an element, but doesn't append it yet.
const new_p = document.createElement("p");
new_p.textContent = "This one's temporary.";

//* "appendChild" lets you insert one node and returns it.
//* "append" lets you insert multiple nodes (and strings as text nodes)
//* as arguments, it doesn't return them though.
p_s.appendChild(new_p);
console.log(p_s.innerHTML);

//* "removeChild" removes it from its parent, but it's still available.
//! "remove" removes it completely, and it's not totally supported yet.
p_s.removeChild(new_p);
console.log(p_s.innerHTML);
