package day17_Loops;

import java.util.Scanner;

public class CarInsurance {
    public static void main(String[] args) {

        double cost=0;

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your name:");
        String name= scan.nextLine();
        System.out.println("Enter your gender");
        String gender= scan.next().toLowerCase();

        while(!(gender.equals("female")||gender.equals("male"))){
            System.err.println("Invalid entry. PLease enter your gender:");
            gender=scan.next().toLowerCase();
        }
        System.out.println("Are you married? yes/no");
        String isMarried=scan.next().toLowerCase();
        while(!(isMarried.equals("yes")||isMarried.equals("no"))){
            System.err.println("Invalid entry. Are you married?");
            isMarried=scan.next().toLowerCase();
        }
        System.out.println("Enter your age");
        int age= scan.nextInt();
        while(age<0||age>120){
            System.err.println("Invalid entry. Please enter your age:");
            age= scan.nextInt();
        }
        System.out.println("How many miles do you drive a day?");
        int miles= scan.nextInt();
        while(miles<5){
            System.err.println("Invalid entry. Please enter miles per day:");
            miles= scan.nextInt();
        }
        scan.nextLine();
        System.out.println("Do you want full coverage or liability insurance?");
        String insuranceType=scan.nextLine().toLowerCase();
        while(!(insuranceType.equals("full coverage")||insuranceType.equals("liability insurance"))){
            System.err.println("Invalid entry. Please enter insurance type.");
            insuranceType=scan.nextLine().toLowerCase();
        }

        System.out.println("Did you have any accidents or claims in the past 5 years?");
        String hasAccidents= scan.next();
        while(!(hasAccidents.equals("yes")||hasAccidents.equals("no"))){
            System.err.println("Invalid entry. Please enter yes / no.");
            hasAccidents=scan.next().toLowerCase();
        }
        System.out.println("Does your car have an anti-theft device? yes/no");
        String hasDevice= scan.next().toLowerCase();
        while(!(hasDevice.equals("yes")||hasDevice.equals("no"))){
            System.err.println("Invalid entry. Please enter yes / no.");
            hasDevice=scan.next().toLowerCase();
        }
        if(insuranceType.equals("liability insurance")) {
            if (age < 25)
                cost += 90;
            else
                cost += 50;
            if (miles <= 10)
                cost += 10;
            else if (miles < 10 && miles <= 50)
                cost += 30;
            else
                cost += 50;
        }else {
            if (age < 25) {
                cost += 160;
            } else {
                cost += 120;
            }
            if (miles <= 10)
                cost += 20;
            else if (miles > 10 && miles <= 50)
                cost += 40;
            else
                cost += 70;
        }
        if(hasDevice.equals("yes"))
            cost*=0.95;
        if(hasAccidents.equals("yes"))
            cost*=1.15;
        else
            cost*=0.9;
        if(isMarried.equals("yes"))
            cost*=0.95;

        System.out.println("name = " + name);
        System.out.println("gender = " + gender);
        System.out.println("isMarried = " + isMarried);
        System.out.println("age = " + age);
        System.out.println("miles = " + miles);
        System.out.println("insuranceType = " + insuranceType);
        System.out.println("hasAccidents = " + hasAccidents);
        System.out.println("hasDevice = " + hasDevice);
        System.out.println("cost = " + cost);

        scan.close();

    }
}
/*
  6. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount

 */