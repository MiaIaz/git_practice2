package day12;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Convert Cents to Dollars:");

        int cent = scan.nextInt();
        int toDollars = cent/100;
        int remainderCent = cent%100;

        System.out.println(cent+ "cent equal to: "+ toDollars + " Dollars and "+ remainderCent + " cents");

scan.close();


    }
}
/*
3. Write a program that can convert cents to dollars, if there is any
remainder include them in the result as cents
Ex:
Enter cents
225
output:
225 cents equal to: 2 dollars and 25 cents
 */