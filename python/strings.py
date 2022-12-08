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

#! "split" doesn't accept "" as an argument
print("Yes or No".split())  # * default: "_"
# print("Wow".split(""))

#* "swapcase", "title", "capitalize"
emotion = "I hate you."
print(emotion.swapcase(), emotion.title(), emotion.capitalize())

# * Reversing a string (with slicing)
print(sentence[::-1])

# * Regular expressions (RegExp)
expr1 = "abcd"
expr2 = "^abcd$"
string = "This is the 'abcd'"

if test(expr1, string) and (not test(expr2, string)):

    # * Python doesn't support emojis
    print("expr1: 'Thumbs Up', expr2: 'Thumbs Down'")
