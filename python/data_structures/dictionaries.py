person = {"name": "Pedro", "age": 22, "color": "blue"}
print(f"person:\t\t\t\t{person}")

print(f'\n["name"]: {person["name"]}')
#! You can't use the dot notation
# print(person.name)
# * "get" is a safer way to access
print(f'.get("degree"): {person.get("degree")}')
# print(person.get("country", "Peru"))

# * "del" removes a key-value pair
del person["color"]
print(f'\ndel person["color"]:\t\t{person}')

print("\n.items(): key, value")
for key, value in person.items():
    print(f"\t{key}:\t{value}")

print("\n.keys()\t.values()")
for key, value in zip(person.keys(), person.values()):
    print(f"{key}\t{value}")

# * Copying
print(f"\n.copy(): {person.copy()}")
print(f"{{**person}}: {dict({**person})}")

# * "update"
# ^ You can also add new key-value pairs
person.update({"age": 24, "id": "1234"})
print(f"\n.update({{'age': 24, 'id': '1234'}}): {person}")

# * "clear"
person.clear()
print(f"\n.clear(): {person}")
