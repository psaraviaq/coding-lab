from re import search as test

sentence = "I love pizza"

# * You can multiply strings
print(sentence*3)

# * "replace"
print(sentence.replace("z", "s"))

# * Reversing a string (with slicing)
print(sentence[::-1])

# * Regular expressions (RegExp)
expr1 = "abcd"
expr2 = "^abcd$"
string = "This is the 'abcd'"

if test(expr1, string) and (not test(expr2, string)):

    # * Python doesn't support emojis
    print("expr1: 'Thumbs Up', expr2: 'Thumbs Down'")
