package day17_Loops;

import java.util.Scanner;

public class DivideTwoPositiveNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first positive number:");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Enter your second positive number:");
        int num2 = new Scanner(System.in).nextInt();

        int num3 = num1;
        int result = 0;
        int remainder = 0;

        while (num1 > 0) {
            remainder = num1;
            num1 = num1 - num2;
            if (num1 < 0) {
                break;
            }
            result += 1;
        }
        System.out.println(num3 + " / " + num2 +
                " = " + result + " and remainder is "
                + remainder);




    }
}
/*
1. Write a program that can divide two positive numbers
without using / (division) and * (multiplication) operators.
 */