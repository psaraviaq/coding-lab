
#! Class definition (methods must contain "self", a convention, as their 1st parameter)
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

print(my_cat.sound)
print(my_cat.gender)
my_cat.saySomething()


class LatinoCat(Cat):
    def __init__(self, name, gender, country) -> None:
        # * Use the "super" keyword when creating sub-classes
        super().__init__(name, gender)
        self.country = country


class PeruvianCat(LatinoCat):
    #! The "__init__" method is not necessary
    def greeting(self):
        print(f'{self.name} is from {self.country}')


another_cat = PeruvianCat("Mimi", "female", "Peru")
another_cat.greeting()
