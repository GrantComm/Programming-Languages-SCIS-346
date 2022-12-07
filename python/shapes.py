"""
Author: Grant Commodore

This program uses a menu that allows the user to choose from a list of shapes. The user
can choose between a rectangle, circle, hexagon, and pentagon. Based on the shape, the user
is prompted to enter the length and width of the shape. The program then calculates the area, 
perimeter, or circumference of the shape.
"""
import math

# Get the user's selection from the menu.
def getSelection():
    print ("|_______________________________________________|")
    print("| 1. Rectangle                                  |")
    print("| 2. Circle                                     |")
    print("| 3. Hexagon                                    |")
    print("| 4. Pentagon                                   |")
    print("| 5. Quit                                       |")
    print ("|_______________________________________________|")
    selection = int(input("Enter your selection: "))
    return selection

# Get the rectangle's length and width and calculate the area and perimeter.
def getRectangle():
    length = float(input("Enter the rectangle length: "))
    width = float(input("Enter the rectangle width: "))
    area = length * width
    perimeter = 2 * (length + width)
    print("The area of the rectangle is: ", area)
    print("The perimeter of the rectangle is: ", perimeter)
    print("")

#Gets the circle's radius and calculates the area and circumference.
def getCircle():
    radius = float(input("Enter the radius of the circle: "))
    area = math.pi * radius ** 2
    circumference = 2 * math.pi * radius
    print("The area of the circle is: ", area)
    print("The circumference of the circle is: ", circumference)
    print("")

# Gets the hexagon's side and calculates the area and perimeter.
def getHexagon():
    side = float(input("Enter the side of the hexagon: "))
    area = 3 * math.sqrt(3) / 2 * side ** 2
    perimeter = 6 * side
    print("The area of the hexagon is: ", area)
    print("The perimeter of the hexagon is: ", perimeter)
    print("")

#Get the pentagon's side and calculates the area and perimeter.
def getPentagon():
    side = float(input("Enter the side of the pentagon: "))
    area = (1/4) * (math.sqrt(5 * (5 + 2 * math.sqrt(5))) * side ** 2)
    perimeter = 5 * side
    print("The area of the pentagon is: ", area)
    print("The perimeter of the pentagon is: ", perimeter)
    print("")

# Run the main program.
def main():
    selection = getSelection()
    while selection != 5:
        print("")
        if selection == 1:
            getRectangle()
        elif selection == 2:
            getCircle()
        elif selection == 3:
            getHexagon()
        elif selection == 4:
            getPentagon()
        else:
            print("Invalid selection. Please try again.")
        selection = getSelection()
    print("Program terminating....done.")

main()

