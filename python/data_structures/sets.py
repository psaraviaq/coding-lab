
# * Examples and methods
my_set = {4, 2, 5, 3, 3, 1, 3, 2}
print(my_set)

# * "add" is like the "append" method for lists
my_set.add(6)
print(my_set)

# * "remove" (also "discard") must have an argument
my_set.remove(2)
print(my_set)

# ? There are also other methods like "union", "intersection", .etc

#! Not a "sequence", they don't contain an ordered index of all elements
# print(my_set[1])

# * Set comprehensions
print({x for x in range(10) if x not in [1, 3, 4, 5, 6]})

# * You can also use other iterable methods with sets
set2 = set("lists")
print(sorted(set2))
print("".join(set2))

# * Using the "set" function may change the order of elements
print(set([2, 6, 1, 3]))
# * It's better to do it any other way
print([*dict.fromkeys([2, 6, 1, 3])])
