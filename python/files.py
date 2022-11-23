
# * Creates the file if it doesn't exist
file = open("./test.txt", "w")
file.write("I'm writing some text!")
file.close()

# * Doing it this way doesn't need the "close" function
with open("./test.txt") as myFile:
    content = myFile.read()
    print(content.split(" "))
