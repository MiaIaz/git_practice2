package day11_Part2_Scanner.day12_Scanner;

import java.util.Scanner;

public class NextLine_Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age= scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();

        System.out.println("Enter your GPA:");
        double gpa = scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter your School Name:");
        String schoolName = scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);
        System.out.println("gpa = " + gpa);

        scan.close();

    }
}
/*
1.Ask user to enter:
age
full name
 */