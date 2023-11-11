
#* ----------------- Mathematical -----------------
3 + 4    #* Addition "+"
1 - 2    #* Subtraction "-"
5 * 6    #* Multiplication "*"
20 / 5   #! Division "/" (returns always a float)
16 % 7   #* Modulus "%"
10 ** 2  #* Exponentiation "**"
74 // 10 #* Floor division "//"
#! Python doesn't support "++" and "--"
# i++

#* ----------------- Logical -----------------
True and False   #* "&&"
False or True    #* "||"
not True         #* "!"

#* ----------------- Comparison -----------------
3 > 1
11 <= 11
1 == True  # * Equal "=="
3 != "3"  # * Not equal "!="

#* ----------------- Others -----------------
#* "in" / "not in" check if a value is in a sequence
print(3 in [1, 3, 6])
print("us" in "sushi")
print(2 not in (2, 7, 4))
#? Other operators: is, of, with, yield

#! Do not use the "eval" function, can lead to running malicious code
print(eval("1+2"))
