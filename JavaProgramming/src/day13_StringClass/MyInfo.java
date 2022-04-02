package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tell me about yourself:");

        System.out.println("Enter your age:");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your gender:");
        String gender = scan.nextLine();

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();

        System.out.println("Enter your phone number:");
        String phoneNumber = scan.nextLine();

        System.out.println("Enter your postcode:");
        String postCode = scan.nextLine();

        System.out.println("Enter your school name:");
        String schoolName = scan.nextLine();

        System.out.println("Enter your city:");
        String city = scan.nextLine();

        System.out.println("Enter your country:");
        String country = scan.next();

        scan.nextLine();

        System.out.println("Enter your building number:");
        int buildingNumber = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your street name:");
        String streetName = scan.nextLine();
        scan.close();


        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("schoolName = " + schoolName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("city = " + city);
        System.out.println("country = " + country);
        System.out.println("postCode = " + postCode);


        scan.close();


    }
}
