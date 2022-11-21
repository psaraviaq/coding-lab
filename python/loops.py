word = "EASY"
#! "for" loops (no conditions, they use the length of a variable)
for letter in "simple":
    print(letter, end=".\n")
for i in range(0, len(word)):
    print(word[i])
for index, letter in enumerate(word):
    print(f'index: {index}, letter: {letter}')
else:
    print("The loop completed without a 'break'")

# * "while" loops
count = 3
while count > 0:
    print(count)
    count -= 1
print("Go!")

# * nested loops
count = 0
for i in range(12):
    for j in range(12):
        count += 1
print(count)
