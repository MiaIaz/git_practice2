package day09_Part2;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you married? True");
        boolean isMarried = scanner.nextBoolean();
        System.out.println("47000");
        double salary = scanner.nextDouble();
        double salaryAfterTax;
        double taxRate1 = 35.0 / 100;
        double taxRate2 = 30.0 / 100;
        double taxRate3 = 25.0 / 100;
        double taxRate4 = 20.0 / 100;
        double taxBreak = 5.0 / 100;

        if (!isMarried) {
            if (salary >= 130000) {
                salaryAfterTax = salary - (salary * taxRate1);
            } else if (salary >= 100000 && salary < 130000) {
                salaryAfterTax = salary - (salary * taxRate2);
            } else if (salary >= 80000 && salary < 100000) {
                salaryAfterTax = salary - (salary * taxRate3);
            } else {
                salaryAfterTax = salary - (salary * taxRate4);
            }

        } else {
            if (salary >= 130000) {
                salaryAfterTax = salary - (salary * (taxRate1 -= taxBreak));
            } else if (salary >= 100000 && salary < 130000) {
                salaryAfterTax = salary - (salary * (taxRate2 -= taxBreak));
            } else if (salary >= 80000 && salary < 100000) {
                salaryAfterTax = salary - (salary * (taxRate3 -= taxBreak));
            } else {
                salaryAfterTax = salary - (salary * (taxRate4 -= taxBreak));
            }

        }
        System.out.println("salaryAfterTax = " + salaryAfterTax);
    }
}
/*

2. Write a program that can calculate the salary after
 tax based on the following requirements
                the tax rates are:
                35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K

     in addition, if the person is married, he/she will pay 5% less tax
 */
