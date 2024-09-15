
#! Strings are not mutable, you can't change a character in a string
sentence = "I love pizza"

#* f-strings: "f" prefix before the string, code inside curly braces
print(f'f"...{{x}}...": {sentence}      len(...): {len(sentence)}')

#* "lower", "upper"
print("\nog: \"Love\"")
print(".lower(): " + "Love".lower(), "\t\t.upper(): " + "Love".upper())

#* "swapcase", "title", "capitalize"
print("\nog: \"I hate you.\"")
print(".swapcase(): " + "I hate you.".swapcase(), "\t.title(): " + "I hate you.".title(), "\t\t.capitalize(): "+ "I hate you.".capitalize())

#* "strip", "lstrip", "rstrip"
print("\n.strip(): \"  wow  \" --> " + "  wow  ".strip(), "\t.lstrip(\".\"): \"...sure\" --> " + "...sure".lstrip("."))

#* "split" (default: " ")
print("\n.split(): \"Yes or No\" --> " + str("Yes or No".split()))
# print(".split(\"a\"): \"array\" --> " + str("array".split("a")))
print("list(\"abc\"): " + str(list("abc"))) #* You can split a string individually with "list"

#* "replace"
print("\n.replace(\"z\", \"s\"): " + sentence.replace("z", "s"))

print("\n----- ADVANCED -----")

#* "translate" and "maketrans" for replacing more characters
print("\n50Y M1LK".translate(str.maketrans("501", "SOI")))

#? raw string
r""