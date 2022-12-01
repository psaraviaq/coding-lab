
# * Examples and methods
my_set = {1, 2, 3, 4, 3, 3, 3, 5}
print(my_set)

# * "add" is like the "append" method for lists
my_set.add(6)
print(my_set)

# * "remove" (also "discard") must have an argument
my_set.remove(2)
print(my_set)

# * There are also another methods like "union", "intersection", .etc

#! Not a "sequence", they don't contain an ordered index of all elements
# print(my_set[1])

# * Set comprehensions
print({x for x in range(10) if x not in [1, 3, 4, 5, 6]})
