//* Class definition (methods don't have the "function" keyword)
class Country {
  constructor(language, currency) {
    this.language = language;
    this.currency = currency;
  }

  definition() {
    console.log("This is an example of a country");
  }
}

//* Instance of the class
const france = new Country("french", "euro");

console.log(`${france.language}: ${france.currency}`);
france.definition();
