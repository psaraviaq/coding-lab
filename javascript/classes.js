//* The "class" keyword was just introduced in ES6
//* Class definition (methods don't have the "function" keyword)
class Country {
  constructor(language, currency) {
    this.language = language;
    this.currency = currency;
  }

  talk() {
    console.log(`In this country, people speak in ${this.language}`);
    this.language = "french";
    console.log(`In this country, people also speak in ${this.language}`);
  }

  getTypes() {
    console.log(this);
    //* Methods are stored in the prototype of the object
    //! Node.js doesn't display non-enumerable properties (so use O.gOPN())
    console.log(Object.getOwnPropertyNames(Object.getPrototypeOf(this)));
  }
}

//* Instance of the class
const canada = new Country("english", "euro");

console.log(`${canada.language}: ${canada.currency}`);
canada.talk();
canada.getTypes();
