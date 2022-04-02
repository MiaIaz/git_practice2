package day11;

import java.sql.SQLOutput;
import java.util.Scanner;

public class day02_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1. Ask the user to entre on integer number
        System.out.println("Enter an integer number:");
        int num1 = input.nextInt();

        //2. Ask the user to entre on decimal number
        System.out.println("Enter a decimal number:");
        double num2 = input.nextDouble();

        //3.Ask the user to entre a word
        System.out.println("Enter a word");
        String str = input.next();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("word = " + str);
        input.close();


    }
}
