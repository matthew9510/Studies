import java.util.Scanner;
/**
 * Created by Scope on 6/16/2017.
 */
public class PrimitiveTypes_AndConversions {
    public static void main(String[] args) {
        /* NON-ARITHMETIC TYPES */
        boolean bool = true;
        char character = 'C';

        /* ARITHMETIC TYPES */
        /* Integral Types */
        byte yum;
        short tiny;
        int integer;
        long superLong;
        /* Floating-point Types */
        double decimalNum;
        float boat;

        if(bool == true)
            System.out.println("The value of character is " + character);
        else
            bool = false;

        yum = 127;
        System.out.println("Declarations that might not have been initiated will cause a compile time error. ");

        if(bool == true && yum > 126)
            System.out.println("The value of yum is " + yum);
        if(bool)
        System.out.println("If a boolean variable is set to true, then a condition with just that variable name should grant the latter code to initiate.");

        tiny = 16_383 * 2 + 1;
        System.out.println("The maximum value a short can hold is " + tiny + ", while the minimum value a short can hold is " + (-tiny - 1));

        integer = 9;
        superLong = 0;
        System.out.println("Although the Long variable named superLong currently has a stored value of " + superLong + ", long type variables can hold a maximum and minimum value of around " + integer
        + " quintillion.");

        decimalNum = 1.0;
        boat = 100.0f;
        System.out.println("Double variables can hold more values than floats. Although both are in formats of decimal numbers. Ex) " + boat);
        System.out.println("Float variables need a f at the end of the value. Ex) " + boat + "f. Where as doubles don't need a 'd' at the end of the initialization. Ex) decimalNum = " + decimalNum + ";");
        System.out.println("\nNOTE:");
        System.out.println("You can't set the precision of a double (or Double) to a specified number of decimal digits, because floating-point values don't have decimal digits. They have binary digits." +
                "\n" + "You will have to convert into a decimal radix, either via BigDecimal or DecimalFormat, depending on what you want to do with the value later.");
    }
}

