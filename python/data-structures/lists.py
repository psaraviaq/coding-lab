
# * Examples and methods
fruits = ["apple", "banana", "watermelon", "orange"]
print(*fruits)
# * Their indexes are flexible
print(fruits[0], fruits[-1])
#! They don't work for indexes out of range, though
# print(fruits[10])

# * "append" adds directly at the end
fruits.append("lemon")
print(*fruits)

fruits.insert(2, ["coco"])
print(*fruits)

fruits.extend(["pear", "berry"])
print(*fruits)

# * "pop" removes an element
fruits.pop()
print(*fruits)

print(fruits.pop(2))
print(*fruits)

# * Iterate through a list
for x in fruits:
    print(x)

# * List comprehensions
print([f'{x}s' for x in fruits])
print([x**2 for x in range(10) if x % 2])
# * You can also use the ternary operator in comprehensions
print([1 if x % 2 else 0 for x in [2, 5, 3, 6]])

# * Operator
my_fruits = [*fruits]
my_fruits[1] = "mango"
print(fruits[1], "and", my_fruits[1])
