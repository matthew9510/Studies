import java.util.Scanner;
/**
 * Created by Scope on 6/17/2017.

 * LEARNED:
 * Scanners are slow, refer to http://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
 * Scanner.next() can only accept Strings, not char types.
 * Scanner.nextChar() does not exist
 * Scanner.next().charAt(#) specifies reading that particular char at an index of a string
 * while (true) executes the loop body indefinitely
 * Consider while loops rather than using multiple if conditions, if this happens jump to this state
 * System.exit() terminates the current Java Virtual machine, a nonzero status code (parameter) indicates abnormal termination.
 * bufferedReader.read() reads in a character, and returns the character read, as an integer ASCII value.
 */
public class PressToQuit {
    public static void main(String[] args) {
        char letterToQuit = '?';
        int numPresses = 0;
        Scanner scnr = new Scanner(System.in);

        /* Version 1 */
        System.out.println("User, press the " + letterToQuit + " key + ENTER " + numPresses + " times to quit.");
        while (true){
            char letterPressed = scnr.next().charAt(0); //next(String).charAt(0)
            while (letterPressed == letterToQuit){
                if (scnr.next().charAt(0) == letterToQuit){
                    System.exit(0);
                }
                else{
                    letterPressed = scnr.next().charAt(0);
                }
            }
        }

        /* Version 2 */
        // Learn to end jvm when a key is pressed without pressing ENTER in between
    }
}

