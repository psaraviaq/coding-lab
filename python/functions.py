
#* "def"
def double(x):
    return x * 2

print(double(5))
#! Arguments are required
# print(double())


#* "None"
def no_return():
    pass

print(no_return())








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
