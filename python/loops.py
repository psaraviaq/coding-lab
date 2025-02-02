#
# * "for" loops
for letter in "LOOP":
    print(letter)

for i in range(4):
    print(f"int: {i}")

# * "while" loops
count = 3
while count > 0:
    print(f"{count}...")
    count -= 1

# * "continue" is used to skip an iteration
for i in range(10):
    if i % 2 == 0:
        continue
    print(i)

# * "break" is used to exit the whole loop
animal = "fish"
while True:
    if animal == "fish":
        break
    print("Wrong animal")
