
#* Functions use the keyword "def"
#* When you don't return anything, it returns "None"
def double(x):

    #* Docstrings add documentation to functions
    """This function multiplies a number by 2"""

    return x * 2

print(double(5))
#! Parameter values are required unless you set a default value
# print(double())

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

#* If you want to have a function that doesn't do anything yet, use the "pass" keyword
def test_code():
    pass