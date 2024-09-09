
#* 1) Numeric (integer, float, complex)
print("------- Numeric -------")
print(f"{type(10).__name__}: {10}, {type(-2.7).__name__}: {-2.7}, {type(1+3j).__name__}: {1+3j}")

#* 2) Sequence
print("\n------- Sequence -------")
print(f"{type("I'm Pedro").__name__}: \"{"I'm Pedro"}\"") #* Strings
print(f"{type([0, 1]).__name__}: {[0, 1]}") #* Lists
print(f"{type((2, 3)).__name__}: {(2, 3)}") #* Tuples (immutable lists)

#* 3) Dictionary (keys must be enclosed in quotes)
print("\n------- Dictionary -------")
dictionary = {"password": 1234}
print(f"{type({"password": 1234}).__name__}: {dictionary}")

#* 4) Boolean (start with a capital letter)
print("\n------- Boolean -------")
print(f"{type(True).__name__}: {True}, {False}")

#* 5) Set (enclosed in curly braces)
print("\n------- Set -------")
_set = {"apple", "orange", "apple"}
print(f"{type(_set).__name__}: {_set}")

#* Falsy Values
print("\n*------ Falsy Values ------*")
print("0:", bool(0))
print("None:", bool(None))
print("\"\":", bool(""))
print("[]:", bool([]))
print("{}:", bool({}))
print("():", bool(()))
print("set():", bool(set()))
print("range(0):", bool(range(0)))

#* type + is, isinstance
print("\n*------ Data type ------*")
print(f"type([]) is list: {type([]) is list}")
print(f"isinstance(\"word\", str): {isinstance("word", str)}") #* Recommended for inheritance
