
person = {"name": "Pedro", "age": 22, "color": "blue"}
print(f"person:\t\t\t\t{person}")

#*-------------- Access --------------
print(f'\n["name"]: {person["name"]}')
#! You can't use the dot notation
# print(person.name)
#* "get" is a safer way to access
print(f'.get("degree"): {person.get("degree")}')
# print(person.get("country", "Peru"))

#* "del" removes a key-value pair
del person["color"]
print(f'\ndel person["color"]:\t\t{person}')

#*-------------- Loops ---------------
print("\n.items(): key, value")
for key, value in person.items():
    print(f'\t{key}:\t{value}')

print("\n.keys()\t.values()")
for key, value in person.keys(), person.values():
    print(f'{key}\t{value}')

#*-------------- Others ---------------

#* Dictionary comprehensions
# print({str(x): x**3 for x in range(1, 6)})
# months = ["Jan", "Feb", "Mar", "Apr"]
# print({a+1: b for (a, b) in zip(range(10), months)})

#* Operator
# someone = {**person}
# someone["name"] = "Ava"
# print(person["name"], "&", someone["name"])
