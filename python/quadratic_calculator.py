"""
Author: Grant Commodore

This program solves quadratic equations. It asks the user for values for a, b, and c. Then, it finds 
the two roots of the equation.
"""
import math 

# Get input from user
def get_input():
    a = float(input("Enter value a: "))
    b = float(input("Enter value b: "))
    c = float(input("Enter value c: "))
    return a, b, c

# Calculate the discriminant
def get_discriminant(a, b, c):
    return b**2 - 4 * a * c

# Calculate the roots of the quadratic equation
def get_roots(discriminant, a, b):
    # If the discriminant is less than 0, then calculate the complex roots
    if discriminant < 0:
        print("The equation has two complex roots: " + str(complex(-b / (2 * a), (math.sqrt(-1*discriminant) / (2 * a)))) + " and " + str(complex(-b / (2 * a), (-math.sqrt(-1*discriminant) / (2 * a)))))
    # If the discriminant is 0, there is one real root
    elif discriminant == 0:
        x = -b / (2 * a)
        print("The equation has one root:", x)
    # If the discriminant is greater than 0, there are two real roots
    else:
        x1 = (-b + math.sqrt(discriminant)) / (2 * a)
        x2 = (-b - math.sqrt(discriminant)) / (2 * a)
        print("The equation has two roots:", x1, "and", x2)

# Main program
def main():
    a, b, c = get_input()
    print("")
    print("a =", a, "b =", b, "c =", c)
    print("The equation is: " + str(a) + "x^2 + " + str(b) + "x + " + str(c) + " = 0")
    
    # Calculate the discriminant
    discriminant = get_discriminant(a, b, c)
    print("The discriminant is: " + str(discriminant))

    # Determine the roots of the quadratic equation
    get_roots(discriminant, a, b)
    print("")

# Run the main program 4 times
for i in range(4):
    main()