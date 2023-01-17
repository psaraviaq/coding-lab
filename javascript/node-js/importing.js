//* Basic use of "require";
const myVariables = require("./exporting.js");
console.log(myVariables);

//* You can destructure the object
const { fruit } = require("./exporting");
console.log(fruit);

//* No need to assign it to a variable
console.log(require("./exporting").number);

//* If path is absolute, it will look in the "node_modules" folder
const fs = require("fs");
console.log(fs.promises.readFile);

//* Filename can contain or not the "js" file extension
//* You can select a folder if it contains an "index.js" file
const { result } = require("./assets");
console.log(result);
