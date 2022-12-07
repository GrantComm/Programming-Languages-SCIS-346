# Grant Commodore

# This program demonstrates a class sturecute with the superclass being a Mammal and the 
# subclasses being a Dog, a Cat, and a Bear. The subclasses have their own methods related to action,
# sound, and a toString method. The superclass has a toString method as well.

# The superclass
class Mammal:
    # The init method accepts an argument for the mammal's species.
    def __init__(self, species = "mammal"):
        self.species = species

    # The show_species method displays a message indicating the mammal's species.
    def show_species(self):
        print("I am a", self.species)

    # The make_sound method is the mammal's way of making a generic sound.
    def make_sound(self):
        print("Grrrr")
    
    # The action method is the mammal's way of doing a generic action.
    def action(self):
        print("Walks forward.")


# The Dog class is a subclass of the Mammal class.
class Dog(Mammal):
    # The __init__ method accepts an argument for the mammal's species.
    def __init__(self, name, species = "dog"):
        self.name = name
        self.species = species

    # Set the name of the dog
    def set_name(self, name):
        self.name = name

    # Get the name of the dog
    def get_name(self):
        return self.name
    
    # The make_sound method overrides the superclass's make_sound method.
    def make_sound(self):
        return "Woof! Woof!"

    # The action method overrides the superclass's action method.
    def action(self):
        return "stumbles back and barks."

    # The __str__ method returns a string indicating the object's state.
    def __str__(self):
        return self.name + ", the " + self.species + " is a mammal. It makes the sound " + self.make_sound() + " and it " + self.action()

# The Cat class is a subclass of the Mammal class.
class Cat(Mammal):
    # The __init__ method accepts an argument for the mammal's species.
    def __init__(self, name, species = "cat"):
        self.name = name
        self.species = species

    # Set the name of the cat
    def set_name(self, name):
        self.name = name

    # Get the name of the cat
    def get_name(self):
        return self.name

    # The make_sound method overrides the superclass's make_sound method.
    def make_sound(self):
        return "Meow! Meow!"

    # The action method overrides the superclass's action method.
    def action(self):
        return "runs forward and meows."

    # The __str__ method returns a string indicating the object's state.
    def __str__(self):
        return self.name + ", the " + self.species + " is a mammal. It makes the sound " + self.make_sound() + " and it " + self.action()


# The Bear class is a subclass of the Mammal class.
class Bear(Mammal):
    # The __init__ method accepts an argument for the mammal's species.
    def __init__(self, name, species = "bear"):
        self.name = name
        self.species = species

    # Set the name of the bear
    def set_name(self, name):
        self.name = name
    
    # Get the name of the bear
    def get_name(self):
        return self.name

    # The make_sound method overrides the superclass's make_sound method.
    def make_sound(self):
        return "Rawrrr! Grrr!"

    # The action method overrides the superclass's action method.
    def action(self):
        return "walks forward and growls."

    # The __str__ method returns a string indicating the object's state.
    def __str__(self):
        return self.name + ", the " + self.species + " is a mammal. It makes the sound " + self.make_sound() + " and it " + self.action()

# The main function.
def main():
    # Create an object from the Dog class.
    spot = Dog("Spot")

    # Display the dog.
    print(spot)

    # Create an object from the Cat class.
    fluffy = Cat("Fluffy")

    # Display the cat.
    print(fluffy)

    # Create an object from the Bear class.
    smokey = Bear("Smokey")

    # Display the bear.
    print(smokey)

# Call the main function.
main()