from re import search as test

sentence = "I love pizza"

# * You can multiply strings
print(sentence*3)

#! Be careful when working with numbers
print("3" == 3)
# print("3" < 3)
print("3" > "1")
print("3" > "22")  # * ....

# * String formatting with numbers
print(3.000000)
print(f'It costs ${3:.6f}')

print("_____________METHODS______________")

# * "replace"
print(sentence.replace("z", "s"))

# * "translate" and "maketrans" for replacing more characters
print("50Y M1LK".translate(str.maketrans("501", "SOI")))

#! "split" doesn't accept "" as an argument
print("Yes or No".split())  # * default: "_"
# print("Wow".split(""))

# * "strip", "lstrip" and "rstrip" remove leading and trailing
# * characters, their default argument is whitespace
print("    wow    ".strip(), "...sure".lstrip("."))

#* "swapcase", "title", "capitalize"
emotion = "I hate you."
print(emotion.swapcase(), emotion.title(), emotion.capitalize())

print("_______________...________________")

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


#* "isalpha", "isdigit", "isalnum"
print("word".isalpha())
print("123".isdigit())
print("2morrow".isalnum())
