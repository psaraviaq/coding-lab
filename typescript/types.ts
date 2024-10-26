//* Unlike interfaces, type aliases can represent primitive types, unions, and tuples.
type Point = {
  x: number;
  y: number;
};

const my_location: Point = {
  x: 3,
  y: 2,
};

//* Union types
let ID: string | number;
let direction: "up" | "down";
