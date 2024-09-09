sentence = "I love pizza"

#* f-strings: "f" prefix before the string, code inside curly braces
print(f'f"...": {sentence} (length: {len(sentence)})')

#* "lower", "upper"
print("\noriginal: \"Love\"")
print("lower(): " + "Love".lower(), "\tupper(): " + "Love".upper())

#* "swapcase", "title", "capitalize"
print("\noriginal: \"I hate you.\"")
print("swapcase(): " + "I hate you.".swapcase(), "\ttitle(): " + "I hate you.".title(), "\tcapitalize(): "+ "I hate you.".capitalize())

#* "strip", "lstrip", "rstrip"
print("\nstrip(): \"  wow  \" --> " + "  wow  ".strip(), "\tlstrip(\".\"): \"...sure\" --> " + "...sure".lstrip("."))
#* "removeprefix", "removesuffix"

#* "split" (default: " ")
print("\nsplit(): Yes or No\" --> " + str("Yes or No".split()))
print("split(\"a\"): \"array\" --> " + str("array".split("a")))
print("list(\"abc\"): " + str(list("abc"))) #* You can split a string individually with "list"

#* "replace"
print("\nreplace(\"z\", \"s\"): " + sentence.replace("z", "s"))
print("replace(\"z\", \".\", 3): \"zzzzzz\" --> " + "zzzzzz".replace("z", ".", 3))

print("\n----- ADVANCED -----")

#* "translate" and "maketrans" for replacing more characters
print("\n50Y M1LK".translate(str.maketrans("501", "SOI")))
