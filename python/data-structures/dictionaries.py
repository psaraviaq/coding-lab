
# * a basic "dictionary"
person = {
    "name": "Pedro",
    "age": 22,
    "languages": ["english"],
    "color": "blue"
}
print(person)
print(person["name"])

#! If the object doesn't contain the key, it throws an error
# print(person["country"])
# * Use the "get" method if the object might not contain the key
# * You can even return a default value if it doesn't exist
print(person.get("degree"), person.get("country", "USA"))

# * Iterate through a dictionary
for key, value in person.items():
    print(f'{key}: {value}')

# * Dictionary comprehensions
print({str(x): x**3 for x in range(1, 6)})
months = ["Jan", "Feb", "Mar", "Apr"]
print({a+1: b for (a, b) in zip(range(10), months)})

# * You can delete a key
del person["color"]
print(person)

# * Operator
someone = {**person}
someone["name"] = "Ava"
print(person["name"], "&", someone["name"])
