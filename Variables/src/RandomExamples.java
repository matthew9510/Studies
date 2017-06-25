import java.util.Random;
import java.util.Scanner;
// import java.lang.Math; //Don't need this.

/**
 * Created by Scope on 6/23/2017.
 */
public class RandomExamples {

    public static void main(String[] args) {
        // Scanner mainScanner = new Scanner(system.in); // ERROR, Capital 'S' needed with System, it's an Object
        Scanner mainScanner = new Scanner(System.in);

        System.out.println("Press (0 + Enter) to run option A: receive a random integer in a particular range");
        System.out.println("Press (1 + Enter) to run option B: The pseudoRandomGenerator");
        int userOption = mainScanner.nextInt();

        if (userOption == 0)
            randomInRange();
        else if (userOption == 1)
            pseudoRandomGenerator();
        else{
            //throw new Exception();
        }

    }

    public static void randomInRange() {
        // What do we need?
        Random randGen = new Random();  // Random object to produce some output
        Scanner scan = new Scanner(System.in); // Lets create a Scanner object to read in some input from the user

        System.out.println("Give the computer the range it needs to produce a random number.");
        System.out.println("Type the minimum number of the range: ");
        int minNum = scan.nextInt();
        System.out.println("Type the maximum number of the range:");
        int maxNum = scan.nextInt();
        int randNumResult = randGen.nextInt(maxNum - minNum + 1) + minNum; // Left to right, This one is kind of tricky.
        System.out.println("The random number is: " + randNumResult);
        System.exit(0);
    }

    // private void pseudoRandomGenerator() { // Error loading it in Main method due to the method not being static
    private static void pseudoRandomGenerator(){ //Notice that this method is private
        // What do we need?
        Scanner scan = new Scanner(System.in); // Lets create a Scanner object to read in some input from the user
        Random randGen = new Random();

        System.out.println("Give the computer the range it needs to produce a random long number in a seed.");
        System.out.println("Type the minimum number of the range: ");
        int minNum = scan.nextInt();
        System.out.println("Type the maximum number of the range:");
        int maxNum = scan.nextInt();
        System.out.println("Set the stream seed, a.k.a(output channel). All 0 to 9 quintillion channels open, choose a channel:"); // type: long bounds
        long seedNum = scan.nextLong();
        randGen.setSeed(seedNum); // Note Long

        // randGen.nextInt(maxNum - minNum + 1) + minNum; The Algorithm is NOT a statement it's self, we need to assign it or do something with it.
        int resultIndex0 = randGen.nextInt(maxNum - minNum + 1) + minNum; // nextInt() pulls from stream
        int resultIndex1 = randGen.nextInt(maxNum - minNum + 1) + minNum; // nextInt() pulls from stream
        int resultIndex2 = randGen.nextInt(maxNum - minNum + 1) + minNum; // nextInt() pulls from stream

        System.out.println("The random number produced at index[0], that is bound by " + minNum + " and " + maxNum + " (inclusive), on channel " + seedNum + " is: " + resultIndex0);
        System.out.println("The random number produced at index[1], that is bound by " + minNum + " and " + maxNum + " (inclusive), on channel " + seedNum + " is: " + resultIndex1);
        System.out.println("The random number produced at index[2], that is bound by " + minNum + " and " + maxNum + " (inclusive), on channel " + seedNum + " is: " + resultIndex2);

        System.exit(0);
    }

}
