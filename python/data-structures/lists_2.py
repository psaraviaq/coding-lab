
# * "count"
print([3, 6, 3, 3, 1, 3].count(3))

# * "index"
print([2, 7, 1, 9, 3].index(9))

# * "join"
print(" ".join(["I", "like", "Webtoon"]))

# * "sort" vs "sorted"
numbers = [2, 3, 1]
print(sorted(numbers), numbers)
print(sorted(numbers, reverse=True), numbers)
print(numbers.sort(), numbers)
