// Grant Commodore

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/* This program creates a list of 32 random numbers. The list is printed along with the sum, 
the average, the minimum, and the maximum, and a sorted version.*/
public class RandomNums {
    // Method that sums the list.
    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    // Main method that begins the execution of the Java application.
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 32; i++) {
            nums.add(new Random().nextInt(100));
        }
        System.out.println("The list of random numbers is: " + nums);
        System.out.println("The sum of the numbers is: " + sum(nums));
        System.out.println("The average of the numbers is: " + (double) sum(nums) / nums.size());
        System.out.println("The minimum number is: " + Collections.min(nums));
        System.out.println("The maximum number is: " + Collections.max(nums));
        Collections.sort(nums);
        System.out.println("The sorted list is: " + nums);
    }
}
