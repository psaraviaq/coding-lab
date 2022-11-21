
# * basic if-else condition
language = "english"
if (language == "en") or (language == "english"):
    print("Hello")
else:
    print("what?")

# * more conditions
number = 8
if not number == 8:
    print("it's a number")
elif (number == 8) and (number % 3 == 0):
    print("it's something")
else:
    print("it's eight")

# * a lot of conditions:
language = "en"
#! For multiple cases, use the "|" operator and not multiple cases
#! There is no "break" for the cases, and the default case is "_"
match language:
    case "es":
        print("Bueno")
    case "fr":
        print("Bon")
    case "english" | "en":
        print("Well")
    case _:
        print("what???")

# * Ternary operator
height = 1.73
description = "tall" if height > 1.7 else "short"
print(description)
