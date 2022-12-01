
# * Examples and methods
my_set = {4, 2, 5, 3, 3, 1, 3, 2}
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

# * There are other ways to work with sets
set2 = set("lists")
print(set2)

print(sorted(set2))
print("".join(set2))
