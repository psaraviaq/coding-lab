
# * They are classed in literals and consist of

# * 1) Numeric
print(type(10))  # * Integers
print(type(-2.7))  # * Floats
print(type(complex(1, 3)))  # * Complex numbers

# * 2) Sequence
print(type("I'm Pedro"))  # * Strings (single or double quotes)
print(len('hello'))  # 'len' is a function
print(type([0, 1]))  # * Lists
print(type((2, 3)))  # ? Tuples (values can't change, need more info)

#! 3) Dictionary (keys must be enclosed in quotes)
print(type({"password": 1234}))

#! 4) Boolean (start with a capital letter)
print(type(True))
print(type(False))

# ? 5) Set (values can't be repeated, still need more info)
print(type({0, 'abc', True}))

# * __________________________Falsy Values_________________________
print("0:", not not 0)
print("None:", not not None)
print("'':", not not "")
print("[]:", not not [])
print("{}:", not not {})
print("():", not not ())
print("set():", not not set())
print("range(0):", not not range(0))
