package day08_IfStatement;

public class SingleStatementIntro {
    public static void main(String[] args) {

        int number = 301;

/*
    System.out.println("Odd Number");
        System.out.println("Even Number");
 */

        boolean evenNumber = number%2 == 0;
        if (evenNumber) {
            System.out.println(number + " is even number");
        }

        if (!evenNumber) {
            System.out.println(number + " is odd number");
        }

        System.out.println("----------------------");
        int n = 200;
        //positive
        if(n > 0){ // if the n is greater than 0, then it's positive
            System.out.println(n + " is positive ");
        }

        //negative
        if(n < 0){ //if the n is less than 0, then it's negative
            System.out.println(n + "is negative");
        }

        //zero
        if(n == 0){ //if the n is 0, then it's negative
            System.out.println(n + " is zero ");
        }



    }
}
