
#! Class definition (methods must contain the "self" parameter):
class Cat:
    sound = "meow"

    # * You can think of "self" as "this" in Javascript
    def intro(self):
        print(f'The cat says: {self.sound}')
        self.sound = "purr"
        print(f'The cat also says: {self.sound}')


# * Instance of a class
my_cat = Cat()

print(my_cat.sound)
my_cat.intro()
