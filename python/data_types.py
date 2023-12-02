
#* They are classed in literals and consist of

#* 1) Numeric (integer, float, complex)
print("------- Numeric -------")
print(type(10).__name__ + ": 10, " + type(-2.7).__name__ + ": -2.7, " + type(1+3j).__name__ + ": 1+3j")
#! You must convert other types to a string before concatenating
print("Using \"_\" between numbers: " + str(10_000_000.00_1))

#* 2) Sequence
print("\n------- Sequence -------")
print(type("I'm Pedro").__name__ + ": \"I'm Pedro\"") #* Strings (single or double quotes)
print(type([0, 1]).__name__ + ": [0, 1]") #* Lists
print(type((2, 3)).__name__ + ": (2, 3)") #* Tuples (immutable lists)

print("len('hello'): " + str(len('hello'))) #* len() returns the length of a sequence
my_list = [7, 8, 9]
print("my_list[0]: " + str(my_list[0])) #* Accessing an element of a sequence

#* 3) Dictionary (keys must be enclosed in quotes)
print("\n------- Dictionary -------")
print(type({"password": 1234}).__name__ + ": {\"password\": 1234}")

#* 4) Boolean (start with a capital letter)
print("\n------- Boolean -------")
print(type(True).__name__ + ": True, False")

#* 5) Set (unordered, unindexed, no duplicates)
print("\n------- Set -------")
my_set = {"apple", "orange", "apple"}
print(type(my_set).__name__ + ": {'apple', 'orange'}")
#! You cannot access items in a set by referring to an index
# print(my_set[1])

#* __________________________Falsy Values_________________________
print("\n------- Falsy Values -------")
print("0:", bool(0))
print("None:", bool(None))
print("\"\":", bool(""))
print("[]:", bool([]))
print("{}:", bool({}))
print("():", bool(()))
print("set():", bool(set()))
print("range(0):", bool(range(0)))

#* Checking the data type
print("\n------- Checking the data type -------")
print("type([]) is list: " + str(type([]) is list))
print("isinstance(\"word\", str): " + str(isinstance("word", str))) #* Recommended for inheritance
