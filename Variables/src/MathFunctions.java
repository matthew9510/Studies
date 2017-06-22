import java.lang.Math;
import java.util.Scanner;
import java.util.Random;

/**
 * Created by Scope on 6/14/2017.
 */
public class MathFunctions {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        /* Square Root Section */
        System.out.println("Please enter number to get square rooted");
        double number = scnr.nextDouble();
        double numSqrt = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + numSqrt + ".");
        System.out.println();

        System.out.println("Automated without user input below:");

        /* Distance Formula Section */
        double x1 = 1.0;
        double y1 = 2.0;
        double x2 = 1.0;
        double y2 = 5.0;
        double pointsDistance;
        pointsDistance = Math.sqrt(Math.pow((x2- x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Points distance: " + pointsDistance);

        /* Tree Height Section */

        /* Simple geometry can compute the height of an object from the the object's shadow length and shadow angle
        using the formula: tan(angleElevation) = treeHeight / shadowLength. Given the shadow length and angle of
        elevation, compute the tree height. */

        double angleElevation = 0.11693706; // 0.11693706 radians = 6.7 degrees
        double shadowLength   = 17.5;
        double treeHeight;

        treeHeight = Math.tan(angleElevation) * shadowLength;
        System.out.println("Tree height: " + treeHeight);

        /* Random Generator */
        System.out.println("Note: Math.random() returns a double from the range (0 - 1) inclusive.");
        int random1 = (int)(Math.random() * 100);
        System.out.println("A random number generated by Math.random(), which returns a double 0 through 1 inclusive, that is casted to an int and multiplied by 100 is " + random1);

        /* Another way to generate a random number */
        // Note: you need to ''import java.util.Random;'' to use this method
        Random randomGenerator = new Random();
        int random2 = randomGenerator.nextInt();
        System.out.println("A random int produced by our new randomGenerator is " + random2);



    }
}
