
# * Useful for handling errors
try:
    [1, 2, 3, 4][20]
except:
    print("Something went wrong")

# * Can also include their type of error
try:
    number = 10/0
except Exception as e:
    print(f'Error: {e}')
