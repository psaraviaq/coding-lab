#
# ^ You can use some operators with lists
print(f'["a"] * 5: {["a"] * 5}')
print(f"[1, 2] + [3, 4]: {[1, 2] + [3, 4]}")

fruits = ["apple", "banana", "pear", "banana"]
# print(fruits[10]) #! You can't use indexes out of range
print("\nfruits:\t\t\t\t\t", fruits)

# * "append"
fruits.append("lemon")
print('\n.append("lemon"):\t\t\t', fruits)

# * "insert" takes additionally an index
fruits.insert(3, "orange")
print('\n.insert(3, "orange"):\t\t\t', fruits)

# ! You can use "del" to remove an element
del fruits[0]
print("\ndel fruits[0]:\t\t\t\t", fruits)

# * "pop"
eaten_fruit = fruits.pop()
print("\n.pop():\t\t\t\t\t", fruits)
# print(eaten_fruit)
# ! ...it can also take an index

# * "remove" deletes the first occurrence of a value
fruits.remove("banana")
print('\n.remove("banana"):\t\t\t', fruits)

# * "sort"
# ^ And it has also a "reverse" argument
fruits.sort()
print("\n.sort():\t\t\t\t", fruits)
# ~ "sorted" changes temporarily the list
# print("sorted(fruits):", sorted(fruits))

# * "reverse"
fruits.reverse()
print("\n.reverse():\t\t\t\t", fruits)

# * "extend" adds multiple elements
fruits.extend(["strawberry", "mango"])
print('\n.extend(["strawberry", "mango"]):\t', fruits)

numbers = [7, 4, 7, 7, 1]
print("\nnumbers:", numbers)
# * "count"
print(".count(7):", numbers.count(7))
# * "index"
print(".index(1):", numbers.index(1))
