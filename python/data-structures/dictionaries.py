
#* A "dictionary" is like an object in other languages
#! Keys are required to be in quotes
person = {"name": "Pedro", "age": 22}
print(person)

#* You can access the value associated with a key using brackets
print(person["name"])
#! But if the key doesn't exist, it will throw an error
# print(person["country"])
#! In Python, you can't use the dot notation to access the value
# print(person.name)

#* To avoid errors, you can use the "get" method, which returns "None" if the key doesn't exist
print(person.get("degree"))
#* You can even add a default value (second argument) to return if the key doesn't exist
print(person.get("country", "USA"))

#* To add a new key-value pair, or update an existing one, you can use brackets
person["color"] = "blue"
person["age"] = 23
print(person)

#* You can also use "del" to delete a key-value pair
del person["color"]
print(person)

#* You can use "items()" to get a list of tuples with the key-value pairs
for key, value in person.items():
    print(f'(Pair) {key}: {value}')

#* Or you can just use "keys()" and "values()" to get them separately
for key in person.keys():
    print("key: " + key)
for value in person.values():
    print(f'value: {value}')

#* Dictionary comprehensions
# print({str(x): x**3 for x in range(1, 6)})
# months = ["Jan", "Feb", "Mar", "Apr"]
# print({a+1: b for (a, b) in zip(range(10), months)})

#* Operator
# someone = {**person}
# someone["name"] = "Ava"
# print(person["name"], "&", someone["name"])
