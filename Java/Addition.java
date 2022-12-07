// Grant Commodore

import java.util.Scanner;

/* This program adds and multiplies four numbers 
and prints their products and sums. */
public class Addition {
    // Main method that begins the execution of the Java application.
    public static void main(String[] args) {

        // Create a Scanner to obtain input from the user.
        Scanner input = new Scanner(System.in);

        // Get the four numbers from the user.
        System.out.println("Enter four numbers: ");
        System.out.println("Enter Integer #1: ");
        int num1 = input.nextInt();
        System.out.println("Enter Integer #2: ");
        int num2 = input.nextInt();
        System.out.println("Enter Integer #3: ");
        int num3 = input.nextInt();
        System.out.println("Enter Integer #4: ");
        int num4 = input.nextInt();

        // Close the input stream.
        input.close();

        // Print the sum and product of the four numbers.
        System.out.println("The sum of the four numbers is " + (num1 + num2 + num3 + num4));
        System.out.println("The product of the four numbers is " + (num1 * num2 * num3 * num4));
    }
}
