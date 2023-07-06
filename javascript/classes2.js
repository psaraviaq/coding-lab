//* Constructor functions (classes before ES6)
function IceCream(flavor) {
  this.flavor = flavor;
  this.taste = function () {
    console.log(`The ${this.flavor} ice cream tastes good`);
  };
}

//* Instance of the constructor
const chocolateIceCream = new IceCream("chocolate");

console.log(chocolateIceCream.flavor);
chocolateIceCream.taste();
