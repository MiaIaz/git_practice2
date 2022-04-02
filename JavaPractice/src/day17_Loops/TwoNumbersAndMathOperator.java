package day17_Loops;

import java.util.Scanner;

public class TwoNumbersAndMathOperator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Please, enter first number:");
        int num1= scan.nextInt();
        System.out.println("Please, enter second number:");
        int num2= scan.nextInt();
        System.out.println("Please, enter a math operator");
        char ch=scan.next().charAt(0);
        while (!(ch=='+'||ch=='-'||ch=='*'||ch=='/')){
            System.err.println("Invalid entry. Please enter a valid operator:");
            ch=scan.next().charAt(0);
        }
        if(ch=='+')
            System.out.println(num1+"+"+num2+"="+(num1+num2));
        if(ch=='-')
            System.out.println(num1+"-"+num2+"="+(num1-num2));
        if(ch=='*')
            System.out.println(num1+"*"+num2+"="+(num1*num2));
        if(ch=='/')
            System.out.println(num1+"/"+num2+"="+(num1/num2));

        scan.close();


    }
}
/*
 3. write a program to ask user to enter two number and math operator,
 and return the result.

		if the operator is invalid operator, ask user to re-enter
		 the operator until user provides a valid operator (+, -, *, /)

 */