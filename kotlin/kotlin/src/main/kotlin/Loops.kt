fun main() {
    //! The loop variable can't be modified because it's a "val"

    //* They use ".." between the start and end of the range
    for (i in 7..9) {
        println(".. " + i)
    }
    //* "downTo" is used to count down
    for (i in 3 downTo 0) {
        println("downTo " + i)
    }
    //* "step" is used to skip numbers
    for (i in 2..10 step 2) {
        println("step " + i)
    }

    //* The "in" keyword works similar to "Python"
    //* It can also be used to check if a value is in a range
    val x = 3
    val numbers = arrayOf(1, 2, 3, 4, 5)
    if (x in numbers) {
        println("The number is in the array")
    }

    //* "while" loops work OK
}