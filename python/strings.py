sentence = "I love pizza"
print("sentence: " + sentence)

# * You can multiply strings
print("\nsentence*3: " + sentence*3)

#* f-strings: Place "f" before the string and inside, put braces around python code
print(f'f"...": {sentence} (length: {len(sentence)})')

#! Be careful when working with numbers
print("\"3\" == 3: " + str("3" == 3))   #* False

print("\n_____________METHODS______________")
print("Strings are immutable, they return a new string\n")

# * "replace"
print("replace(\"z\", \"s\"): " + sentence.replace("z", "s"))
print("replace(\"z\", \".\", 3): \"zzzzzz\" --> " + "zzzzzz".replace("z", ".", 3))

# * "translate" and "maketrans" for replacing more characters
print("\n50Y M1LK".translate(str.maketrans("501", "SOI")))

#! "split" doesn't accept "" as an argument
print("\nsplit(): Yes or No\" --> " + str("Yes or No".split())) #* default: " "
print("split(\"a\"): \"array\" --> " + str("array".split("a")))
print("list(\"abc\"): " + str(list("abc"))) #* You can split a string individually with "list"

# * "strip", "lstrip" and "rstrip" remove leading and trailing
# * characters, their default argument is whitespace
print("\nstrip(): \"  wow  \" --> " + "  wow  ".strip(), "\tlstrip(\".\"): \"...sure\" --> " + "...sure".lstrip("."))

# * "lower", "upper"
print("\nstring: \"Love\"")
print("lower(): " + "Love".lower(), "\tupper(): " + "Love".upper())

# * "swapcase", "title", "capitalize"
emotion = "I hate you."
print("\nstring: \"I hate you.\"")
print("swapcase(): " + emotion.swapcase(), "\ttitle(): " + emotion.title(), "\tcapitalize(): "+ emotion.capitalize())

print("\n_______________...________________")

from re import search as test

# * ASCII values
print(ord("A"))    # * character --> ASCII
print(chr(65))     # * ASCII --> character

# * Regular expressions (Regex)
expr1 = "abcd"
expr2 = "^abcd$"
string = "This is the 'abcd'"

if test(expr1, string) and (not test(expr2, string)):

    # * Python doesn't support emojis
    print("expr1: 'Thumbs Up', expr2: 'Thumbs Down'")

# * "islower", "isupper"
print("hate".islower())
print("HATE".isupper())

# * "isalpha", "isdigit", "isalnum"
print("word".isalpha())
print("123".isdigit())
print("2morrow".isalnum())
