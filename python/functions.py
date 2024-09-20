
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

#* "*args" (tuple)
def pizza(*toppings):
    for topping in toppings:
        print(f"- {topping}")
pizza("pepperoni", "mushrooms", "onions")

#* "**kwargs" (dictionary)
def user_data(**person):
    for key, value in person.items():
        print(f"{key}: {value}")
user_data(name="Pedro", age=24)
