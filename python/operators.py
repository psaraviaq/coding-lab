#
# * Multiple assignment
a, b, c = 1, 2, 3
print(a, b, c)

# * ----------------- Mathematical -----------------
# * Addition "+"
# * Subtraction "-"
# * Multiplication "*"
# ! Division "/" (returns always a float)
# * Modulus "%"
# * Exponentiation "**"
# * Floor division "//"
# ! Python doesn't support "++" and "--"
# i++

# * ----------------- Logical -----------------
# * and ("&&")
# * or ("||")
# * not ("!")

# * ----------------- Others -----------------

# * "in" / "not in" (checks if a value is in a sequence)
print(3 in [1, 3, 6])
print("us" in "sushi")
print(2 not in (2, 7, 4))
# ~ It also works with keys in dictionaries
print("id" in {"id": 3})

# ! Don't use "eval" for production code
# print(eval("1+2"))
