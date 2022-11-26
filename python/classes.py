
#! Class definition (methods must contain the "self" parameter):
class Cat:
    sound = "meow"

    # * Similar to the "constructor" in other languages
    def __init__(self, name, gender) -> None:
        self.name = name
        self.gender = gender

    # * You can think of "self" as "this" in Javascript
    def saySomething(self):
        print(f'The {self.name} says: {self.sound}')
        self.sound = "purr"
        print(f'The {self.name} also says: {self.sound}')


# * Instance of a class
my_cat = Cat("Pacha", "female")

print(my_cat.gender)
print(my_cat.sound)
my_cat.saySomething()
