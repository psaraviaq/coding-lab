fruits = ["apple", "banana"]
print("fruits:", fruits)

#* In Python, you can use negative indexes to access elements from the end
print("fruits[-1]:", fruits[-1])
#! But you can't use indexes out of range
# print(fruits[10])

#* "append" adds an element to the end of the list
fruits.append("mango")
print("\nappend(\"mango\"):\t\t", fruits)

#* "insert" adds an element to the specified index
fruits.insert(2, "orange")
print("\ninsert(2, \"orange\"):\t\t", fruits)

#* "extend" adds multiple elements as a list to the end of the list
fruits.extend(["pear", "watermelon"])
print("\nextend([\"pear\", \"watermelon\"]):\t", fruits)

#* You can use "del" to remove an element by index
del fruits[-2]
print("\ndel fruits[-2]:\t\t\t", fruits)

#* "pop" removes the last element by default, or the element at the specified index
fruits.pop()
print("pop():\t\t\t\t", fruits)
#* and you can store the removed element in a variable
popped_fruit = fruits.pop(2)
print("pop(2): (" + popped_fruit + ")\t\t", fruits)

#* "remove" removes the first occurrence of the specified element
fruits.remove("banana")
print("remove(\"banana\"):\t\t", fruits)

vowels = ["i", "e", "u", "a", "o"]
print("\nvowels:", vowels)
#* "sort" (changes the original list) and "sorted" (returns a new list) sort the list
vowels.sort()
print("\nvowels.sort()", vowels)
print("sorted(vowels, reverse=True):", sorted(vowels, reverse=True)) #* returns a new list

print("\nvowels:", vowels)
#* "reverse" changes the original list in reverse order
vowels.reverse()
print("\nvowels.reverse()", vowels)