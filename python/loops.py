
#* "for" loops (they don't use conditions, they iterate over a sequence)
#* First the names of the variables, then the keyword "in", and finally the sequence
#! Use ":" to start a block of code, and indent the block
for letter in "LOOP":
    print(letter)

#* To work with numbers, you can use "range"
for i in range(4):
    print(f'int: {i}')

#* "enumerate" is used when you need the index and the element of a sequence
for index, value in enumerate(['a', 'b', 'c']):
    print(f'index: {index} , value: {value}')
#* The "else" block is executed when the loop is completed without a "break"
else:
    print("The loop completed without a 'break'")

print("\n-------- while --------")

#* "while" loops
count = 3
while count > 0:
    print(count)
    count -= 1
print("Go!")
