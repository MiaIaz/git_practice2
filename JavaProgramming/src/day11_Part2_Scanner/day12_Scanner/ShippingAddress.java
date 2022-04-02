package day11_Part2_Scanner.day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();

        System.out.println("Enter your building number:");
        String buildingName = scan.next();

        scan.nextLine();

        System.out.println("Enter your street name:");
        String streetName = scan.nextLine();

        System.out.println("Enter your city:");
        String city = scan.nextLine();

        System.out.println("Enter your state:");
        String state = scan.next();

        scan.nextLine();

        System.out.println("Enter your postcode:");
        String postCode = scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingName = " + buildingName);
        System.out.println("streetName = " + streetName);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("postCode = " + postCode);

        scan.close();


    }
}
