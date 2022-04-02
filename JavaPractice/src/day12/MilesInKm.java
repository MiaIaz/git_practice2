package day12;

import java.util.Scanner;

public class MilesInKm {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles:");

        double miles = scan.nextDouble();
        double km = miles * 1.6;

        System.out.println(miles + " Miles Equal To " + km + " KM");
        scan.close();



    }
}
/*
4. Write a program that can convert Miles to KM
Ex:
Enter miles:
10.0
output:
10.0 miles equal to 16.09 kilometers
 */