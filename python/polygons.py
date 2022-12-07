# Grant Commodore

# Class Polygon plus 4 sub-classes: Rectangle, Hexagon, Circle, and Pentagon.  
# Rectangle has a sub-class, Square. Each shape has a method for area and perimeter or circumference 
# and color. The Number of sides is a class variable for each subclasses. There are also getters and 
# setters. The str method prints the type of shape, color, and area.

import math

# The superclass Polygon
class Polygon:
    # The __init__ method accepts arguments for the number of sides, length of each side, and color.
    def __init__(self, sides, length, color):
        self.sides = sides
        self.length = length
        self.color = color

    # Set the number of sides.
    def set_sides(self, sides):
        self.sides = sides

    # Get the number of sides.
    def get_sides(self):
        return self.sides

    # Set the length of each side.
    def set_length(self, length):
        self.length = length

    # Get the length of each side.
    def get_length(self):
        return self.length

    # Set the color of the shape.
    def set_color(self, color):
        self.color = color

    # Get the color of the shape.
    def get_color(self):
        return self.color

    # The area method calculates the area of the shape.
    def area(self):
        return self.sides * self.length ** 2 / (4 * math.tan(math.pi / self.sides))

    # The perimeter method calculates the perimeter of the shape.
    def perimeter(self):
        return self.sides * self.length

    # The __str__ method returns a string indicating the object's state.
    def __str__(self):
        return "A " + self.color + " " + str(self.sides) + "-sided polygon with each side " + str(self.length) + " units long."

# The Rectangle class is a subclass of the Polygon class.
class Rectangle(Polygon):
    # The __init__ method accepts arguments for the number of sides, length of each side, and color.
    def __init__(self, length, width, color):
        self.sides = 4
        self.length = length
        self.width = width
        self.color = color

    # Set the length of each side.
    def set_length(self, length):
        self.length = length

    # Get the length of each side.
    def get_length(self):
        return self.length

    # Set the width of each side.
    def set_width(self, width):
        self.width = width

    # Get the width of each side.
    def get_width(self):
        return self.width

    # The area method calculates the area of the rectangle.
    def area(self):
        return self.length * self.width

    # The perimeter method calculates the perimeter of the rectangle.
    def perimeter(self):
        return 2 * self.length + 2 * self.width

    # The __str__ method returns a string indicating the object's state.
    def __str__(self):
        return "A " + self.color + " rectangle has an area of " + str(self.area()) + " and a perimeter of " + str(self.perimeter()) + "."

# The Square class is a subclass of the Rectangle class.
class Square(Rectangle):
    # The __init__ method accepts arguments for the number of sides, length of each side, and color.
    def __init__(self, length, color):
        self.sides = 4
        self.length = length
        self.width = length
        self.color = color

    # Set the length of each side.
    def set_length(self, length):
        self.length = length

    # Get the length of each side.
    def get_length(self):
        return self.length

    # Set the width of each side.
    def set_width(self, width):
        self.width = width

    # Get the width of each side.
    def get_width(self):
        return self.width

    # The area method calculates the area of the square.
    def area(self):
        return self.length * self.width

    # The perimeter method calculates the perimeter of the square.
    def perimeter(self):
        return 2 * self.length + 2 * self.width

    # The __str__ method returns a string indicating the object's state.
    def __str__(self):
        return "A " + self.color + " square has an area of " + str(self.area()) + " and a perimeter of " + str(self.perimeter()) + "."

# The Hexagon class is a subclass of the Polygon class.
class Hexagon(Polygon):
    # The __init__ method accepts arguments for the number of sides, length of each side, and color.
    def __init__(self, length, color):
        self.sides = 6
        self.length = length
        self.color = color

    # Set the length of each side.
    def set_length(self, length):
        self.length = length

    # Get the length of each side.
    def get_length(self):
        return self.length

    # The area method calculates the area of the hexagon.
    def area(self):
        return self.sides * self.length ** 2 / (4 * math.tan(math.pi / self.sides))

    # The perimeter method calculates the perimeter of the hexagon.
    def perimeter(self):
        return self.sides * self.length

    # The __str__ method returns a string indicating the object's state.
    def __str__(self):
        return "A " + self.color + " hexagon has an area of " + str(self.area()) + " and a perimeter of " + str(self.perimeter()) + "."

# The Circle class is a subclass of the Polygon class.
class Circle(Polygon):
    # The __init__ method accepts arguments for the number of sides, length of each side, and color.
    def __init__(self, radius, color):
        self.sides = 0
        self.radius = radius
        self.color = color

    # Set the radius of the circle.
    def set_radius(self, radius):
        self.radius = radius

    # Get the radius of the circle.
    def get_radius(self):
        return self.radius

    # The area method calculates the area of the circle.
    def area(self):
        return math.pi * self.radius ** 2

    # The perimeter method calculates the perimeter of the circle.
    def perimeter(self):
        return 2 * math.pi * self.radius

    # The __str__ method returns a string indicating the object's state.
    def __str__(self):
        return "A " + self.color + " circle has an area of " + str(self.area()) + " and a circumference of " + str(self.perimeter()) + "."

# The Pentagon class is a subclass of the Polygon class.
class Pentagon(Polygon):
    # The __init__ method accepts arguments for the number of sides, length of each side, and color.
    def __init__(self, length, color):
        self.sides = 5
        self.length = length
        self.color = color

    # Set the length of each side
    def set_length(self, length):
        self.length = length

    # Get the length of each side
    def get_length(self):
        return self.length

    # The area method calculates the area of the pentagon.
    def area(self):
        return self.sides * self.length ** 2 / (4 * math.tan(math.pi / self.sides))

    # The perimeter method calculates the perimeter of the pentagon.
    def perimeter(self):
        return self.sides * self.length

    # The __str__ method returns a string indicating the object's state.
    def __str__(self):
        return "A " + self.color + " pentagon has an area of " + str(self.area()) + " and a perimeter of " + str(self.perimeter()) + "."

# The Main function
def main():
    # Create a Rectangle object.
    rect = Rectangle(4, 5, "red")

    # Create a Square object.
    square = Square(4, "blue")

    # Create a Hexagon object.
    hexagon = Hexagon(4, "green")

    # Create a Circle object.
    circle = Circle(4, "yellow")

    # Create a Pentagon object.
    pentagon = Pentagon(4, "purple")

    # Display the data.
    print(rect)
    print(square)
    print(hexagon)
    print(circle)
    print(pentagon)

main()