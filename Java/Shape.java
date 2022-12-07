// Grant Commodore

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Shapes class with Circle, Rectangle, Pentagon, and Hexagon inheriting from it.  
The Rectangle class has a child class, Square. The child classes have an area method and a color.  
Each child class has a toString method that prints the information about the object 
(type of shape, color, perimeter, area, list of sides). The parent class has a list of sides and a 
perimeter/circumference. */

public class Shape {

    static Scanner input = new Scanner(System.in);
    List<Integer> sides = new ArrayList<Integer>();
    double area = 0;
    double perimeter = 0;

    // Get the user's selection from the menu.
    public static int getSelection() {
        System.out.println("|_______________________________________________|");
        System.out.println("| 1. Rectangle                                  |");
        System.out.println("| 2. Square                                     |");
        System.out.println("| 3. Pentagon                                   |");
        System.out.println("| 4. Hexagon                                    |");
        System.out.println("| 5. Circle                                     |");
        System.out.println("| 6. Quit                                       |");
        System.out.println("|_______________________________________________|");
        System.out.println("Enter your selection: ");
        int selection = input.nextInt();
        return selection;
    }

    // Get the area of the shape.
    public double getArea() {
        return area;
    }

    // Get the perimeter of the shape.
    public double getPerimeter() {
        return perimeter;
    }

    // The Rectangle class is a subclass of the Shape class.
    public static class Rectangle extends Shape {
        int length;
        int width;
        String color;

        // The constructor for the Rectangle class.
        public Rectangle(boolean isRectangle) {
            if (isRectangle) {
                sides.clear();
                System.out.println("Please enter the length of the rectangle: ");
                this.length = input.nextInt();
                System.out.println("Please enter the width of the rectangle: ");
                this.width = input.nextInt();
                System.out.println("Please enter the color of the rectangle: ");
                this.color = input.next();

                // Add the length and width to the sides list.
                sides.add(length);
                sides.add(width);
                sides.add(length);
                sides.add(width);
            }
        }

        // The getArea method returns the area of the rectangle.
        @Override
        public double getArea() {
            return length * width;
        }

        // The getPerimeter method returns the perimeter of the rectangle.
        @Override
        public double getPerimeter() {
            return 2 * (length + width);
        }

        // The toString method returns a string indicating the dimensions of the
        // rectangle.
        public String toString() {
            return "Rectangle: Color: " + color + ", Perimeter: " + getPerimeter() + ", Area: " + getArea()
                    + ", Side 1: "
                    + sides.get(0) + ", Side 2: " + sides.get(1) + ", Side 3: " + sides.get(2) + ", Side 4: "
                    + sides.get(3);
        }
    }

    // The Square class is a subclass of the Rectangle class.
    public static class Square extends Rectangle {
        int side;

        // The constructor for the Square class.
        public Square() {
            super(false);
            sides.clear();
            System.out.println("Please enter the side of the square: ");
            this.side = input.nextInt();
            System.out.println("Please enter the color of the square: ");
            this.color = input.next();
            // Add the sides to the sides list.
            sides.add(side);
            sides.add(side);
            sides.add(side);
            sides.add(side);
        }

        // The getArea method returns the area of the square.
        @Override
        public double getArea() {
            return side * side;
        }

        // The getPerimeter method returns the perimeter of the square.
        @Override
        public double getPerimeter() {
            return 4 * side;
        }

        // The toString method returns a string indicating the dimensions of the
        // square.
        public String toString() {
            return "Square: Color: " + color + ", Perimeter: " + getPerimeter() + ", Area: " + getArea()
                    + ", Side 1: "
                    + sides.get(0) + ", Side 2: " + sides.get(1) + ", Side 3: " + sides.get(2) + ", Side 4: "
                    + sides.get(3);
        }
    }

    // The Pentagon class is a subclass of the Shape class.
    public static class Pentagon extends Shape {
        int side;
        String color;

        // The constructor for the Pentagon class.
        public Pentagon() {
            sides.clear();
            System.out.println("Please enter the side of the pentagon: ");
            this.side = input.nextInt();
            System.out.println("Please enter the color of the pentagon: ");
            this.color = input.next();

            // Add the sides to the sides list.
            sides.add(side);
            sides.add(side);
            sides.add(side);
            sides.add(side);
            sides.add(side);
        }

        // The getArea method returns the area of the pentagon.
        @Override
        public double getArea() {
            return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
        }

        // The getPerimeter method returns the perimeter of the pentagon.
        @Override
        public double getPerimeter() {
            return 5 * side;
        }

        // The toString method returns a string indicating the dimensions of the
        // pentagon.
        public String toString() {
            return "Pentagon: Color: " + color + ", Perimeter: " + getPerimeter() + ", Area: " + getArea()
                    + ", Side 1: "
                    + sides.get(0) + ", Side 2: " + sides.get(1) + ", Side 3: " + sides.get(2) + ", Side 4: "
                    + sides.get(3) + ", Side 5: " + sides.get(4);
        }
    }

    // The Hexagon class is a subclass of the Shape class.
    public static class Hexagon extends Shape {
        int side;
        String color;

        // The constructor for the Hexagon class.
        public Hexagon() {
            sides.clear();
            System.out.println("Please enter the side of the hexagon: ");
            this.side = input.nextInt();
            System.out.println("Please enter the color of the hexagon: ");
            this.color = input.next();

            // Add the sides to the sides list.
            sides.add(side);
            sides.add(side);
            sides.add(side);
            sides.add(side);
            sides.add(side);
            sides.add(side);
        }

        // The getArea method returns the area of the hexagon.
        @Override
        public double getArea() {
            return (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;
        }

        // The getPerimeter method returns the perimeter of the hexagon.
        @Override
        public double getPerimeter() {
            return 6 * side;
        }

        // The toString method returns a string indicating the dimensions of the
        // hexagon.
        public String toString() {
            return "Hexagon: Color: " + color + ", Perimeter: " + getPerimeter() + ", Area: " + getArea()
                    + ", Side 1: "
                    + sides.get(0) + ", Side 2: " + sides.get(1) + ", Side 3: " + sides.get(2) + ", Side 4: "
                    + sides.get(3) + ", Side 5: " + sides.get(4) + ", Side 6: " + sides.get(5);
        }
    }

    // The circle class that is a subclass of Shape.
    public static class Circle extends Shape {
        int radius;
        String color;

        // The constructor for the Circle class.
        public Circle() {
            sides.clear();
            System.out.println("Please enter the radius of the circle: ");
            this.radius = input.nextInt();
            System.out.println("Please enter the color of the circle: ");
            this.color = input.next();

            // Add the radius to the sides list.
            sides.add(radius);
        }

        // The getArea method returns the area of the circle.
        @Override
        public double getArea() {
            return Math.PI * Math.pow(radius, 2);
        }

        // The getPerimeter method returns the perimeter of the circle.
        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        // The toString method returns a string indicating the dimensions of the
        // circle.
        public String toString() {
            return "Circle: Color: " + color + ", Circumference: " + getPerimeter() + ", Area: " + getArea()
                    + ", Radius: " + sides.get(0);
        }
    }

    // The main method that runs the program.
    public static void main(String args[]) {
        int selection = getSelection();
        while (selection != 6) {
            System.out.println();
            if (selection == 1) {
                Rectangle rectangle = new Rectangle(true);
                System.out.println();
                System.out.println(rectangle);
            } else if (selection == 2) {
                Square square = new Square();
                System.out.println();
                System.out.println(square);
            } else if (selection == 3) {
                Pentagon pentagon = new Pentagon();
                System.out.println();
                System.out.println(pentagon);
            } else if (selection == 4) {
                Hexagon hexagon = new Hexagon();
                System.out.println();
                System.out.println(hexagon);
            } else if (selection == 5) {
                Circle circle = new Circle();
                System.out.println();
                System.out.println(circle);
            } else if (selection == 6) {
                break;
            } else {
                System.out.println("Invalid selection. Please try again.");
            }
            System.out.println();
            selection = getSelection();
        }
        System.out.println("Program terminated.");
    }
}
