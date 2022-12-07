// Grant Commodore

import java.util.Scanner;

/* This program solves quadratic equations. The user is asked for the values jA, B, C. 
Both roots are found and then the program indicates if they are the same. 
Complex roots are also handled. This process runs 4 times.*/

public class Quadratic {
    // Variable declarations.
    static double a = 0;
    static double b = 0;
    static double c = 0;

    public static void getRoots() {
        // Get the discriminant.
        double discriminant = (b * b) - (4 * a * c);
        // Print the discriminant.
        System.out.println("The discriminant is " + discriminant);
        // If the discriminant is greater than 0, then the roots are real.
        if (discriminant > 0) {
            // Get the roots.
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            // Print the roots.
            System.out.println("The two real roots are " + root1 + " and " + root2);
            // If the roots are the same, then print that they are the same.
            if (root1 == root2) {
                System.out.println("The roots are the same.");
            }
        }
        // If the discriminant is less than 0, then the roots are complex.
        else if (discriminant < 0) {
            // Get the parts of the roots.
            double unreal1 = -b / (2 * a);
            double unreal2 = Math.sqrt(-discriminant) / (2 * a);
            // Print the roots.
            System.out.println("The complex roots are " + unreal1 + " ± " + unreal2 + "i");
        }
        // If the discriminant is 0, then the roots are the same.
        else {
            // Get the root.
            double root = -b / (2 * a);
            // Print the root.
            System.out.println("The one real root is " + root);
        }
        System.out.println();
    }

    // Main method that begins the execution of the Java application.
    public static void main(String[] args) {
        // Create a Scanner to obtain input from the user.
        Scanner input = new Scanner(System.in);

        // Run this process 4 times.
        for (int i = 0; i < 4; i++) {
            // Get the values of A, B, and C from the user.
            System.out.println("Enter the value of A: ");
            a = input.nextInt();
            System.out.println("Enter the value of B: ");
            b = input.nextInt();
            System.out.println("Enter the value of C: ");
            c = input.nextInt();
            getRoots();
        }

        input.close();
    }
}
