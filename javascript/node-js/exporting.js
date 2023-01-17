//* Using "module.exports"
module.exports = {
  number: 6,
  sum: (a, b) => a + b,
};
//* It doesn't have to be necessarily an object
// module.exports = true;
//* It can also be used for exporting properties
module.exports.color = "blue";
//! Be careful, it could overwrite previous properties
// module.exports.color = "green";
// module.exports = {
//   number: 1,
//   subtraction: (a, b) => a - b,
// };
