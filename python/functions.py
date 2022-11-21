
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
