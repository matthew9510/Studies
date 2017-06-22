/**
 * Created by Scope on 6/15/2017.
 */
public class PrecedenceRules {

    public static void main(String [] args){
        int integer1 = 1;
        int integer2 = 2;
        double double1 = 1.0;
        double double2 = 2.0;



        System.out.println("integer addition");
        PrecedenceRules.integerAddition(integer1, integer2);

        System.out.println("double addition");
        PrecedenceRules.doubleAddition(double1, double2);

        System.out.println("integer subtraction");
        PrecedenceRules.integerSubtraction(integer1, integer2);

        System.out.println("double subtraction");
        PrecedenceRules.doubleSubtraction(double1, double2);

        System.out.println("integer division");
        PrecedenceRules.integerDivision(integer1, integer2);
        PrecedenceRules.integerDivision(10,3);
        PrecedenceRules.integerDivision(10,10);

        System.out.println("double division");
        PrecedenceRules.doubleDivision(double1, double2);
        PrecedenceRules.doubleDivision(10.0,3.0);
        PrecedenceRules.doubleDivision(10.0,10.0);

        System.out.println("integer multiplication");
        PrecedenceRules.integerMultiplication(integer1, integer2);
        PrecedenceRules.integerMultiplication(-10, 3);


        System.out.println("double multiplication");
        PrecedenceRules.doubleMultiplication(double1, double2);
        PrecedenceRules.doubleMultiplication(-10.0, 3);

        System.out.println("integer modulo");
        PrecedenceRules.integerModulo(integer1, integer2);
        PrecedenceRules.integerModulo(10,3);
        PrecedenceRules.integerModulo(10,10);

        System.out.println("double modulo");
        PrecedenceRules.doubleModulo(double1, double2);
        PrecedenceRules.doubleModulo(10.0,3.0);
        PrecedenceRules.doubleModulo(10.0,10.0);

        System.out.println("compound operators");
        PrecedenceRules.integerIncrement(integer1, 1);
        PrecedenceRules.doubleIncrement(double1, 1.0);
        PrecedenceRules.integerDecrement(integer1, 1);
        PrecedenceRules.doubleDecrement(double1, 1.0);
        PrecedenceRules.integerMultiplicationCompoundOperator(integer1, 3);
        PrecedenceRules.doubleMultiplicationCompoundOperator(double1, 3.0);
        PrecedenceRules.integerDivisionCompoundOperator(integer2, 3);
        PrecedenceRules.doubleDivisionCompoundOperator(double2, 3.0);

    }

    /**
     * Prints integer1 + integer2 = integerAdditionResult
     * @param a integer1
     * @param b integer2
     */
    public static void integerAddition(int a, int b){
        int integerAdditionResult = a + b;
        System.out.println(a + " + " + b + " = " + integerAdditionResult);
    }

    /**
     * Prints double1 + double2 = doubleAdditionResult
     * @param a double1
     * @param b double2
     */
    public static void doubleAddition(double a, double b) {
        double doubleAdditionResult = a + b;
        System.out.println(a + " + " + b + " = "  + doubleAdditionResult);
    }

    /**
     * Prints integer1 - integer2 = integerSubtractionResult
     * @param a integer1
     * @param b integer2
     */
    public static void integerSubtraction(int a, int b) {
        int integerSubtractionResult = a - b;
        System.out.println(a + " - " + b + " = " + integerSubtractionResult);
    }

    /**
     * Prints double1 - double2 = doubleSubtractionResult
     * @param a double1
     * @param b double2
     */
    public static void doubleSubtraction(double a, double b) {
        double doubleSubtractionResult = a - b;
        System.out.println(a + " - " + b + " = "  + doubleSubtractionResult);
    }

    /**
     * Prints integer1 / integer2 = integerDivisionResult
     * @param a integer1
     * @param b integer2
     */
    public static void integerDivision(int a, int b) {
        int integerDivisionResult = a / b;
        System.out.println(a + " / " + b + " = "  + integerDivisionResult);
    }

    /**
     * Prints double1 / double2 = doubleDivisionResult
     * @param a double1
     * @param b double2
     */
    public static void doubleDivision(double a, double b) {
        double doubleDivisionResult = a / b;
        System.out.println(a + " / " + b + " = "  + doubleDivisionResult);
    }

    /**
     * Prints integer1 * integer2 = integerMultiplicationResult
     * @param a integer1
     * @param b integer2
     */
    public static void integerMultiplication(int a, int b) {
        int integerMultiplicationResult = a * b;
        System.out.println(a + " * " + b + " = "  + integerMultiplicationResult);
    }

    /**
     * Prints double1 * double2 = doubleMultiplicationResult
     * @param a double1
     * @param b double2
     */
    public static void doubleMultiplication(double a, double b) {
        double doubleMultiplicationResult = a * b;
        System.out.println(a + " * " + b + " = "  + doubleMultiplicationResult);
    }

    /**
     * Prints integer1 % integer2 = integerModuloResult
     * @param a integer1
     * @param b integer2
     */
    public static void integerModulo(int a, int b) {
        int integerModuloResult = a % b;
        System.out.println(a + " % " + b + " = "  + integerModuloResult);
    }

    /**
     * Prints double1 % double2 = doubleModuloResult
     * @param a double1
     * @param b double2
     */
    public static void doubleModulo(double a, double b) {
        double doubleModuloResult = a % b;
        System.out.println(a + " % " + b + " = "  + doubleModuloResult);
    }

    /**
     * Prints a += b
     * @param a integer1
     * @param b integer2
     */
    public static void integerIncrement(int a, int b) {
        int temp = a;
        temp += b;
        System.out.println(a + " += " + b + " = " + temp);
    }

    /**
     * Prints a += b
     * @param a double1
     * @param b double2
     */
    public static void doubleIncrement(double a, double b) {
        double temp = a;
        temp += b;
        System.out.println(a + " += " + b + " = " + temp);
    }

    /**
     * Prints a -= b
     * @param a integer1
     * @param b integer2
     */
    public static void integerDecrement(int a, int b) {
        int temp = a;
        temp -= b;
        System.out.println(a + " -= " + b + " = " + temp);
    }

    /**
     * Prints a -= b
     * @param a double1
     * @param b double2
     */
    public static void doubleDecrement(double a, double b) {
        double temp = a;
        temp -= b;
        System.out.println(a + " -= " + b + " = " + temp);
    }
    /**
     * Prints a *= b
     * @param a integer1
     * @param b integer2
     */
    public static void integerMultiplicationCompoundOperator(int a, int b) {
        int temp = a;
        temp *= b;
        System.out.println(a + " *= " + b + " = " + temp);
    }

    /**
     * Prints a *= b
     * @param a double1
     * @param b double2
     */
    public static void doubleMultiplicationCompoundOperator(double a, double b) {
        double temp = a;
        temp *= b;
        System.out.println(a + " *= " + b + " = " + temp);
    }

    /**
     * Prints a /= b
     * @param a integer1
     * @param b integer2
     */
    public static void integerDivisionCompoundOperator(int a, int b) {
        int temp = a;
        temp /= b;
        System.out.println(a + " /= " + b + " = " + temp);
    }

    /**
     * Prints a /= b
     * @param a double1
     * @param b double2
     */
    public static void doubleDivisionCompoundOperator(double a, double b) {
        double temp = a;
        temp /= b;
        System.out.println(a + " /= " + b + " = " + temp);
    }

}
