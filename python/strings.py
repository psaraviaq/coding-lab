from re import search as test

sentence = "I love pizza"

# * You can multiply strings
print(sentence*3)

#! Be careful when working with numbers
print("3" == 3)
# print("3" < 3)
print("3" > "1")
print("3" > "22")  # * ....

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

# * Regular expressions (RegExp)
expr1 = "abcd"
expr2 = "^abcd$"
string = "This is the 'abcd'"

if test(expr1, string) and (not test(expr2, string)):

    # * Python doesn't support emojis
    print("expr1: 'Thumbs Up', expr2: 'Thumbs Down'")

print(int(str(0).strip("0")) or 0)
