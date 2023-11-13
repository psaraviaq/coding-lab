//* Functions are declared with the "fun" keyword

//* Void functions don't need a return type
fun main() {
    foo(2, "2")
}

//! Parameters are required to have a type
//! And so does the return type if it's going to return something
fun foo(a: Int, b: String): Int {
    println("a: $a, b: $b")
    return 2
}

//! Parameters can't be reassigned because they use the "val" keyword
// fun constant(number: Int) {
//     number = 2
// }

//* There are one-line functions too, they don't need curly braces and return types
//* They just use the "=" sign
fun squared(x: Int) = x * x
