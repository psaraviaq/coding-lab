
# * simple function
def factorial(n):
    if n == 0:
        return 1
    return n * factorial(n - 1)


def code():
    pass


print(factorial(5))
#! if a value doesn't get returned, it outputs "none"
print(code())

# * "args" keyword


def totalSum(*args):
    sum = 0
    for x in args:
        sum += x
    return sum


print(totalSum(10, 3, 8))

# ? There is also "**kwargs"
