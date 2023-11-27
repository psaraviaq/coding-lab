
#* "input" takes a string as an argument and displays it in the shell
#* It then waits for the user to type something and press enter
name = input("What's your name? ")

print(f'Hello, {name}!')

age = input("How old are you? ")
#* It always returns a string, but you can convert it to an integer or float to do math
age = int(age)

print(age > 18)
