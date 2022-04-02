package day17_Loops;

import java.util.Scanner;

public class NegativeNumbers_CalculateSum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Please enter your first number: ");
            int firstNum = scan.nextInt();

            if(firstNum <0 ){
                break;
            }

            System.out.println("Please enter your second number: ");
            int secondNum = scan.nextInt();
            if(secondNum <0 ){
                break;
            }

            System.out.println("Addition of the numbers =  " + (firstNum+secondNum));

        }
    }
}
/*
2. Write a program that calculates the sum of numbers entered
by the user until user enters a negative number.

            hint: you need an infinite loop
 */