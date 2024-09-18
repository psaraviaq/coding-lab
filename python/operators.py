
#* ----------------- Mathematical -----------------
#* Addition "+"
#* Subtraction "-"
#* Multiplication "*"
#! Division "/" (returns always a float)
#* Modulus "%"
#* Exponentiation "**"
#* Floor division "//"
#! Python doesn't support "++" and "--"
# i++

#* ----------------- Logical -----------------
#* and ("&&")
#* or ("||")
#* not ("!")

#* ----------------- Others -----------------

#* "in" / "not in"
print(3 in [1, 3, 6])
print("us" in "sushi")
print(2 not in (2, 7, 4))
print("id" in {"id": 3}) #* Same as .keys()

#! Don't use "eval" for production code
# print(eval("1+2"))