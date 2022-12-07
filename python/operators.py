
# * Mathematical
print(3 + 4)  # * Addition "+"
print(1 - 2)  # * Subtraction "-"
print(5 * 6)  # * Multiplication "*"
#! Division "/" (returns always a float)
print(20 / 5)
print(16 % 7)  # * Modulus "%"
print(10 ** 2)  # * Exponentiation "**"
print(74 // 10)  # * Floor division "//"
print("_________________________________________")

# *Logical
print(True and False)  # * "and"
print(False or True)  # * "or"
print(not True)  # * "not"
print("_________________________________________")

# * Comparison
print(3 > 1)
print(11 <= 11)
print(1 == True)  # * Equal "=="
print(3 != "3")  # * Not equal "!="
print("_________________________________________")

# * Others
print(3 in [1, 3, 6])  # * "in" / "not in"
print("us" in "sushi")
print(2 not in (2, 7, 4))
print("_________________________________________")

#! Do not use the "eval" function, can lead to running malicious code
print(eval("1+2"))

# * Built-in functions that are not included in the "math" library
print(abs(-7))                # * "abs"
print(max([2, 9, 15, 7]))     # * "max"
print(min([2, 9, 15, 7]))     # * "min"
print(f'min: {min(["a", "b", "c"])}, max: {max("xyz")}')
#! "round" doesn't work like in other languages
print(round(4.5))
