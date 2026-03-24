#
# ^ You can use some operators with lists
print(f'["a"] * 5: {["a"] * 5}')
print(f"[1, 2] + [3, 4]: {[1, 2] + [3, 4]}")

favorite_fruits = ["apple", "banana", "pear", "banana"]
# print(fruits[10]) #! You can't use indexes out of range
print("\nfruits:\t\t\t\t\t", favorite_fruits)

# * "append" adds an element at the end
print('\n.append("lemon"):\t\t\t', favorite_fruits)

# * "insert" works like 'append' but you can specify the index
favorite_fruits.insert(3, "orange")
print('\n.insert(3, "orange"):\t\t\t', favorite_fruits)

# ! You can use "del" to remove an element
del favorite_fruits[0]
print("\ndel fruits[0]:\t\t\t\t", favorite_fruits)

# * "pop" removes the last element
eaten_fruit = favorite_fruits.pop()
print("\n.pop():\t\t\t\t\t", favorite_fruits)
# print(eaten_fruit)
# ! ...it can also take an index

# * "remove" deletes the first occurrence of a value
favorite_fruits.remove("banana")
print('\n.remove("banana"):\t\t\t', favorite_fruits)

# * "sort" orders the list
# ^ And it also has a "reverse" argument
favorite_fruits.sort()
print("\n.sort():\t\t\t\t", favorite_fruits)
# ~ "sorted" changes temporarily the list
# print("sorted(fruits):", sorted(fruits))

# * "reverse" inverts the list
favorite_fruits.reverse()
print("\n.reverse():\t\t\t\t", favorite_fruits)

# * "extend" can add multiple elements by passing a list
favorite_fruits.extend(["strawberry", "mango"])
print('\n.extend(["strawberry", "mango"]):\t', favorite_fruits)

numbers = [7, 4, 7, 7, 1]
print("\nnumbers:", numbers)
# * "count" returns the number of occurrences of a value
print(".count(7):", numbers.count(7))
# * "index" returns the index of the first occurrence of a value
print(".index(1):", numbers.index(1))
