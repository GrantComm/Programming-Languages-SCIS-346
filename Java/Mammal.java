// Grant Commodore

/* This program demonstrates a class sturecute with the superclass being a Mammal and the 
subclasses being a Dog, a Cat, and a Bear. The subclasses have their own methods related to action,
sound, and a toString method. The superclass has a toString method as well.
*/

// Mammal class that acts as the superclass.
public class Mammal {
    private String species;

    public Mammal(String species) {
        this.species = species;
    }

    // The show_species method displays a message indicating the mammal's species.
    public void showSpecies() {
        System.out.println("I am a " + species + ".");
    }

    // The make_sound method is the mammal's way of making a generic sound.
    public String makeSound() {
        return "Grrrr";
    }

    // The action method is the mammal's way of doing a generic action.
    public String action() {
        return "walks forward.";
    }

    // The Dog class is a subclass of the Mammal class.
    public static class Dog extends Mammal {
        private String name;

        public Dog(String name, String species) {
            super(species);
            this.name = name;
        }

        // Set the name of the dog.
        public void setName(String newName) {
            name = newName;
        }

        // Get the name of the dog.
        public String getName() {
            return name;
        }

        // The makeSound method overrides the superclass's make_sound method.
        @Override
        public String makeSound() {
            return "Woof! Woof!";
        }

        // The action method overrides the superclass's action method.
        @Override
        public String action() {
            return "stumbles back and barks.";
        }

        // The toString method returns a string indicating the object's state.
        public String toString() {
            return name + ", the " + super.species + " is a mammal. It makes the sound " + makeSound() + " and it "
                    + action();
        }
    }

    // The Cat class is a subclass of the Mammal class.
    public static class Cat extends Mammal {
        private String name;

        public Cat(String name, String species) {
            super(species);
            this.name = name;
        }

        // Set the name of the cat.
        public void setName(String newName) {
            name = newName;
        }

        // Get the name of the cat.
        public String getName() {
            return name;
        }

        // The makeSound method overrides the superclass's make_sound method.
        @Override
        public String makeSound() {
            return "Meow! Meow!";
        }

        // The action method overrides the superclass's action method.
        @Override
        public String action() {
            return "runs forward and meows.";
        }

        // The toString method returns a string indicating the object's state.
        public String toString() {
            return name + ", the " + super.species + " is a mammal. It makes the sound " + makeSound() + " and it "
                    + action();
        }
    }

    // The Bear class is a subclass of the Mammal class.
    public static class Bear extends Mammal {
        private String name;

        public Bear(String name, String species) {
            super(species);
            this.name = name;
        }

        // Set the name of the bear.
        public void setName(String newName) {
            name = newName;
        }

        // Get the name of the bear.
        public String getName() {
            return name;
        }

        // The make_sound method overrides the superclass's makeSound method.
        @Override
        public String makeSound() {
            return "Rawrrr! Grrr!";
        }

        // The action method overrides the superclass's action method.
        @Override
        public String action() {
            return "walks forward and growls.";
        }

        // The toString method returns a string indicating the object's state.
        public String toString() {
            return name + ", the " + super.species + " is a mammal. It makes the sound " + makeSound() + " and it "
                    + action();
        }
    }

    // Main method that begins the execution of the program.
    public static void main(String[] args) {
        // Create an object from the Dog class.
        Dog dog = new Dog("Fido", "Dog");
        // Display the dog.
        System.out.println(dog);

        // Create an object from the Cat class.
        Cat cat = new Cat("Fluffy", "Cat");
        // Display the cat.
        System.out.println(cat);

        // Create an object from the Bear class.
        Bear bear = new Bear("Yogi", "Bear");
        // Display the bear.
        System.out.println(bear);
    }
}
