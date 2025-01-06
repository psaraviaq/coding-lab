#
# * "def"
def sum(x, y):
    return x + y


print(sum(5, 3))

# ! Arguments are required
# print(sum())
# * Keyword arguments
print(sum(y=2, x=7))


# * Default parameters
def multiply(x, y=1):
    return x * y


print(multiply(5))


# * You can return multiple values (tuple)
def multiple_values():
    return 1, 2, 3


a, b, c = multiple_values()
print(a, b, c)


# * When no return is specified, the function returns "None"
def no_return():
    pass


print(no_return())


# * "*args" (tuple)
def pizza(*toppings):
    print(toppings)


pizza("pepperoni", "mushrooms", "onions")


# * "**kwargs" (dictionary)
def user_data(**person):
    print(person)


user_data(name="Pedro", age=24)
