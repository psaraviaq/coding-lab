#
# ! Strings are not mutable
sentence = "I love pizza"
# sentence[0] = "i"

# * "len"
print("len(...):", len(sentence))

# * f-strings (solve the problem of concatenation)
print(f'\nf"...{{x}}...": {sentence}')

# * "lower", "upper" (converts the string to lowercase/uppercase)
print("\n.lower(): " + sentence.lower(), "\t\t.upper(): " + sentence.upper())

# * "replace" (replaces a substring with another)
# ! It replaces all occurrences unlike other languages
print('\n.replace("z", "s"): ' + sentence.replace("z", "s"))

# * "strip" (removes whitespace from both ends by default) / "lstrip", "rstrip"
# ^ It can also take an argument to remove a specific character
print('\n.strip(): "  wow  " --> ' + "  wow  ".strip())
# ! "removeprefix", "removesuffix" (they only remove once)

# * "capitalize", "title", "swapcase"
print(
    "\n.capitalize(): " + sentence.capitalize(),
    "\t.title(): " + sentence.title(),
    "\t\t.swapcase(): " + sentence.swapcase(),
)

# * "split" (divide a string into a list of substrings using spaces by default)
# ^ It can also take a character to split the string
print("\n.split():", str(sentence.split()))
# ! However, you can't pass an empty string, use "list" instead
