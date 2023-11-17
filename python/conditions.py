number = 0
language = "uk"

#* "if", "elif" (else if) and "else" blocks

if number > 0:
    print("The number is positive")
elif number < 0:
    print("The number is negative")
else:
    print("The number is zero")


#* "match" (switch) was introduced in Python 3.10, which provides the following features:

#* 1. The cases don't need a "break" statement
#* 2. The default case is "_"
#* 3. Use "|" to match multiple values

match language:
    case "es":
        print("Bueno")
    case "fr":
        print("Bon")
    case "us" | "uk":
        print("Well")
    case _:
        print("?")

#* Ternary operator
x = 2
print("even" if x % 2 == 0 else "odd")
