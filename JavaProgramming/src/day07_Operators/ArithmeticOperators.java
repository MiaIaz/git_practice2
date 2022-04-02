package day07_Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 15;

        int division = num1 / num2;//division variable contains the results of num1 divided by num2
        int remainder = num1 % num2; //remainder variable contains the results of num1 divided by number
        //10 divide by 3 is equal to 3 with remainder of 1

        System.out.println(num1 + " divided by " + num2 +" is equal to " + division + " with remainder of " + remainder);

        //what's the remainder of 25 divided 4 :
        System.out.println( 25 % 4 );

        //what's the remainder of 25 divided 5:
        System.out.println(25 % 5);
    }
}
