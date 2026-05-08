#
# * List comprehensions are a shorthand for creating lists
# * ["___" for "___" in "___"]
print([x**2 for x in range(1, 6)])

# * Set comprehensions
# * {"___" for "___" in "___"}
print({x for x in "12321"})

# * Dictionary comprehensions
# * {"___": "___" for "___" in "___"}
days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
print({d: len(d) for d in days})
