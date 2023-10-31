
#* Concatenate lists with the "+" operator
print("[1, 2] + [3, 4]:", [1, 2] + [3, 4])

#* Use the "list" function to convert an iterable to a list
color = list("blue")
print("\nlist(\"blue\"):", color)
even_numbers = list(range(0, 10, 2))
print("list(range(0, 10, 2)):", even_numbers)

#* There are also mathematical functions that take iterables as arguments
print("\nmin([1, 2, 3]):", min([1, 2, 3]))
print("max([1, 2, 3]):", max([1, 2, 3]))
print("sum([1, 2, 3]):", sum([1, 2, 3]), "\n")

#* List comprehensions are a shorthand for creating lists
#* Inside the brackets, put the expression followed by a "for" clause without a colon
print([x**2 for x in range(5)])

numbers = [7, 4, 7, 7, 1]
print("\nnumbers:", numbers)
#* "count" returns the number of occurrences of the specified element
print("count(7):", numbers.count(7))
#* "index" returns the index of the first occurrence of the specified element
print("index(1):", numbers.index(1))
#* You cam slice lists by using a colon between the start and end indexes
print("numbers[1:4]:", numbers[1:4])
#* A third number can be used to specify the step
print("numbers[::2]:", numbers[::2])

#* "join" works for iterables
# print(" ".join(["I", "like", "Webtoon"]))
# print("...".join("123"))

#* "map" (can take multiple iterables) and "filter" return iterables
# print([*map(int, ["2", "6", "7"])])
# print(list(map(lambda x, y: x**y, [3, 2, 4], [5, 6, 2])))
# print(list(filter(bool, [3, [], True, {}, ""])))

#* Operators
# my_fruits = [*fruits]
# my_fruits[1] = "mango"
# print(fruits[1], "and", my_fruits[1])
