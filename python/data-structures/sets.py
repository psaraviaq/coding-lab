my_set = {3, 2, 3, 7}
print(my_set)

#* Sets have the "add" and "remove" methods
my_set.add(6)
print(my_set)

my_set.remove(2)
print(my_set)

#* The "set" function can be used to create a set from a sequence
set2 = set("lists")
print(set2)

#* Set comprehensions
# print({x for x in range(10) if x not in [1, 3, 4, 5, 6]})
