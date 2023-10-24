sentence = "I love pizza"

# * You can multiply strings
print("string*3: " + sentence*3)

#* f-strings: Place "f" before the string and inside, put braces around python code
print(f'f-string: {sentence} (length: {len(sentence)})')

#! Be careful when working with numbers
print("3" == 3)   #* False

# * String formatting with numbers
print(3.000000)
print(f'It costs ${3:.6f}')

print("\n_____________METHODS______________")
print("Strings are immutable, they return a new string\n")

# * "replace"
print(sentence.replace("z", "s"))     # * default 'count' value: -1,
print("zzzzzz".replace("z", ".", 3))  # * which means 'replace all'

# * "translate" and "maketrans" for replacing more characters
print("50Y M1LK".translate(str.maketrans("501", "SOI")))

#! "split" doesn't accept "" as an argument
print("Yes or No".split())  # * default: "_"
# print("Wow".split(""))

# * "strip", "lstrip" and "rstrip" remove leading and trailing
# * characters, their default argument is whitespace
print("strip: \"  wow  \" --> " + "  wow  ".strip(), "\tlstrip(\".\"): \"...sure\" --> " + "...sure".lstrip("."))

# * "lower", "upper"
print("\nstring: \"Love\"")
print("lower: " + "Love".lower(), "\tupper: " + "Love".upper())

# * "swapcase", "title", "capitalize"
emotion = "I hate you."
print("\nstring: \"I hate you.\"")
print("swapcase: " + emotion.swapcase(), "\ttitle: " + emotion.title(), "\tcapitalize: "+ emotion.capitalize())

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
