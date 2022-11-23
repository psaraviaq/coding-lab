//! Exception: Semicolon must be added at the end of first line
var fs = require("fs/promises");

(async function () {
  //* Creates the file if it doesn't exist
  await fs.writeFile("./test.txt", "My name is Pedro");

  //* The reading function needs the "utf-8" argument
  var file = (await fs.readFile("./test.txt", "utf-8")).split(" ");
  console.log(file);
})();
