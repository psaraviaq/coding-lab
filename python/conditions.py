num = 0

# * "if", "elif", "else"
if num > 0:
    print("positive")
elif num < 0:
    print("negative")
else:
    print("zero")

# * ___ if ___ else ___ (ternary operator)
print("even" if num % 2 == 0 else "odd")

# * "match"
lang = "uk"
match lang:
    case "es":
        print("hola")
    case "fr":
        print("bonjour")
    case "us" | "uk":  # ! "|" multiple values
        print("hello")
    case _:  # ! "_" default case
        print("?")
