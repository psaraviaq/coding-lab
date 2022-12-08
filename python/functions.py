
# * simple function
def factorial(n):     # could have '...(n=0):' as a default value
    if n == 0:
        return 1
    return n * factorial(n - 1)


print(factorial(5))

#! if parameters are optional, then they should have a default value;
#! otherwise the function will throw an error
# factorial()


def code():
    pass


#! if a value doesn't get returned, it outputs "None"
print(code())

# * "args" keyword


def totalSum(*args):
    sum = 0
    for x in args:
        sum += x
    return sum


print(totalSum(10, 3, 8))

# ? There is also "**kwargs"

#! Lambda functions (only accept one expression)
op = (lambda a, b: a**b)
print(op(2, 8))
