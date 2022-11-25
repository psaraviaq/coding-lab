
#! Class definition (methods must contain the "self" parameter):
class Cat:
    sound = "meow"

    def intro(self):
        print("The cat says: 'meow'")


# * Instance of a class
my_cat = Cat()

print(my_cat.sound)
my_cat.intro()
