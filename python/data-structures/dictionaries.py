
# * a basic "dictionary"
person = {
    "name": "Pedro",
    "age": 22,
    "languages": ["english"],
    "color": "blue"
}
print(person)
print(person["name"])

# * Iterate through a dictionary
for key, value in person.items():
    print(f'{key}: {value}')

# * You can delete a key
del person["color"]
print(person)
