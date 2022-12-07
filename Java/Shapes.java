// Grant Commodore

import java.util.Scanner;

/* This program computes the appropriate area, and/or perimeter and circumference.  
It also echoes any dimensions used.*/
public class Shapes {
    static Scanner input = new Scanner(System.in);

    // Get the user's selection from the menu.
    public static int getSelection() {
        System.out.println("|_______________________________________________|");
        System.out.println("| 1. Rectangle                                  |");
        System.out.println("| 2. Circle                                     |");
        System.out.println("| 3. Hexagon                                    |");
        System.out.println("| 4. Pentagon                                   |");
        System.out.println("| 5. Quit                                       |");
        System.out.println("|_______________________________________________|");
        System.out.println("Enter your selection: ");
        int selection = input.nextInt();
        return selection;
    }

    // Get the rectangle's length and width and calculate the area and perimeter.
    public static void getRectangle() {
        System.out.println("Enter the rectangle length: ");
        double length = input.nextDouble();
        System.out.println("Enter the rectangle width: ");
        double width = input.nextDouble();
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }

    // Gets the circle's radius and calculates the area and circumference.
    public static void getCircle() {
        System.out.println("Enter the circle's radius: ");
        double radius = input.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circumference);
    }

    // Gets the hexagon's side and calculates the area and perimeter.
    public static void getHexagon() {
        System.out.println("Enter the hexagon's side: ");
        double side = input.nextDouble();
        double area = (3 * Math.sqrt(3) / 2) * Math.pow(side, 2);
        double perimeter = 6 * side;
        System.out.println("The area of the hexagon is: " + area);
        System.out.println("The perimeter of the hexagon is: " + perimeter);
    }

    // Get the pentagon's side and calculates the area and perimeter.
    public static void getPentagon() {
        System.out.println("Enter the pentagon's side: ");
        double side = input.nextDouble();
        double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
        double perimeter = 5 * side;
        System.out.println("The area of the pentagon is: " + area);
        System.out.println("The perimeter of the pentagon is: " + perimeter);
    }

    // Main method that begins the execution of the Java application.
    public static void main(String[] args) {
        // Run this program until the user selects the quit option.
        int selection = 0;
        while (selection != 5) {
            selection = getSelection();
            switch (selection) {
                case 1:
                    getRectangle();
                    break;
                case 2:
                    getCircle();
                    break;
                case 3:
                    getHexagon();
                    break;
                case 4:
                    getPentagon();
                    break;
                case 5:
                    System.out.println("Program Terminated!");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }
        }

        input.close();
    }
}
