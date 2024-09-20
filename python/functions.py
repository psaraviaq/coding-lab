
#* "def"
def sum(x, y):
    return x + y
print(sum(5, 3))

#! Arguments are required
# print(sum())
#* Keyword arguments
print(sum(y=2, x=7))

#* "None"
def no_return():
    pass
print(no_return())

#* Default parameters
def multiply(x, y=1):
    return x * y
print(multiply(5))









#* You can pass an arbitrary number of arguments using a "*" before the parameter
#* It converts the arguments into a tuple (iterable)
def pizza(*toppings):
    print(toppings)

pizza("pepperoni", "mushrooms", "onions")

#* You can pass an arbitrary number of keyword arguments using a "**" before the parameter
#* It converts the arguments into a dictionary
def info(**person):
    print(person)

info(name="John", age=22, height=1.80)
