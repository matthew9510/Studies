import java.util.Scanner;

/**
 * Created by Scope on 6/15/2017.
 */
public class ConstantPracticeGradeCalculator {

    public static void main(String[] args) {

        double coursePercentage;
        Scanner scnr = new Scanner(System.in);

        // Homework
        System.out.println("Enter homework weight without adding the percent sign and as an integer type: ");
        final double HOMEWORK_WEIGHT = (double) scnr.nextInt() * 0.01;
        System.out.println("Enter max possible homework points as an integer type: ");
        final double HOMEWORK_MAX = (double) scnr.nextInt();
        System.out.println("Enter your homework score as an integer type: ");
        double homeworkScore = (double) scnr.nextInt();
        coursePercentage = (homeworkScore / HOMEWORK_MAX) * HOMEWORK_WEIGHT;

        // Quizzes
        System.out.println("Enter quiz weight without adding the percent sign and as an integer type: ");
        final double QUIZ_WEIGHT = (double) scnr.nextInt() * 0.01;
        System.out.println("Enter max possible quiz points as an integer type: ");
        final double QUIZ_MAX = (double) scnr.nextInt();
        System.out.println("Enter your quiz score as an integer type: ");
        double quizScore = (double) scnr.nextInt();
        coursePercentage += (quizScore / QUIZ_MAX) * QUIZ_WEIGHT;

        // Midterm
        System.out.println("Enter Midterm weight without adding the percent sign and as an integer type: ");
        final double MIDTERM_WEIGHT = (double) scnr.nextInt() * 0.01;
        System.out.println("Enter max possible midterm points as an integer type: ");
        final double MIDTERM_MAX = (double) scnr.nextInt();
        System.out.println("Enter your midterm score as an integer type: ");
        double midtermScore = (double) scnr.nextInt();
        coursePercentage += (midtermScore / MIDTERM_MAX) * MIDTERM_WEIGHT;

        // Final
        System.out.println("Enter final weight without adding the percent sign and as an integer type: ");
        final double FINAL_WEIGHT = (double) scnr.nextInt() * 0.01;
        System.out.println("Enter max possible final points as an integer type: ");
        final double FINAL_MAX = (double) scnr.nextInt();
        System.out.println("Enter your final score as an integer type: ");
        double finalScore = (double) scnr.nextInt();
        coursePercentage += (finalScore / FINAL_MAX) * FINAL_WEIGHT;
        coursePercentage *= 100; // Make the value a %percentage
        System.out.println("Your course percentage is " + coursePercentage);

        /*
         * Handle multiple midterms and consider if homework should be included
         * Research IllegalArgumentException() vs IllegalParameterException()
         */
    }
}
