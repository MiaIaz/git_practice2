package day12;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Provide product name:");
        String companyName = input.nextLine();

        System.out.println("Enter the Price");
        double money= input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity= input.nextInt();

        System.out.println("Enter your name");
        String name= input.next();

        System.out.println(name + ", your order for "+quantity+
                " "+ companyName+ " has been placed." +
                "your total is £" +money);
        input.close();
    }
}
/*
6. PlaceAnOrder task:
Ask User to enter the product name (multiple words)
Ask the user to enter the price  (double)
Ask the user to enter the quantity (int)
Ask the user to enter their first name (String, single
word)
Print in the following format:
Ex:
Input: "Apples" , 1.5, 5. "Luke"
Output:
Luke, your order for 5 Apples has been places.
Your total is 7.5.
 */