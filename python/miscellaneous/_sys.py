import sys

# * "exit" causes the program to terminate immediately
while True:
    user_input = input("Type 'q' to quit: ")
    if user_input == "q":
        print("Exiting the program...")
        sys.exit()
