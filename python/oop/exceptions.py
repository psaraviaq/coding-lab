import time, sys

# * "try" / "except" blocks

try:
    while True:
        print(".")
        time.sleep(1)
except KeyboardInterrupt:
    sys.exit()


# * "raise" allows you to throw an exception
def area(length, width):
    if length < 0 or width < 0:
        raise ValueError("Length and width must be non-negative.")
    return length * width


try:
    print(area(5, 3))
    print(area(-1, 2))
except ValueError:
    print("An error occurred while calculating the area.")
