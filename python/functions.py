#
# * Define a function with the "def" keyword
# ~ "None" is returned by default if there is no return statement
def greet(name):
    print(f"Hello, {name}!")


greet("Alice")
#! Arguments are mandatory unless you provide a default value
# greet()

# * Named parameters allow you to specify arguments by name
print("Hello", "World", sep=", ", end="!")
