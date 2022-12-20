
# * Example and methods
my_tuple = (5, False, "#python", False)
no_parentheses = [1, 4], 3.0, "."
print(type(no_parentheses))

# * Number of occurrences within the tuple
print(my_tuple.count(False))
# * Index of where the value lies in the tuple
print(no_parentheses.index(3.0))

# * Iterate through a tuple
for e in my_tuple:
    print(e)

# * Their elements are immutable
# my_tuple[1] = True

# * "zip" returns an iterator of tuples based on iterable objects
print(*zip(["x", "y", "z"], "abcde", range(10)))
print(type(zip()))
