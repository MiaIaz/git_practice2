package day13_part02;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Have you a valid passport?");
        String validPassport = scan.next();


        if (validPassport.equals("yes")){
            int costTicket = 1000;
            System.out.println("Which country do you travel to?");
            scan.nextLine();
            String country = scan.nextLine();
            System.out.println("How many bags will you take?");
            byte bag = scan.nextByte();
            costTicket += bag*50;

            System.out.println("How many people will travel with you?");
            short people = scan.nextShort();

            costTicket = (people<=3)? costTicket - people*100 : costTicket - 300;

            System.out.println("Enter the name of the people:");
            scan.nextLine();
            String names = scan.nextLine();

            System.out.println("Your ticket is booked to " + country + ". We have charged extra for the " +
                    bag + " bags but you are travelling with " + names + " so we are giving a discount. " +
                    "Your total cost is " + costTicket + "$.");
        }else if (validPassport.equals("no")){

            int costPassport = 200;

            System.out.println("When did your passport expire?");
            int year = scan.nextInt();
            costPassport += (2022 - year )*75;

            System.out.println("Which country do you plan to travel?");
            scan.nextLine();
            String country = scan.nextLine();

            System.out.println("Will you travel in the next year?");
            String nextYear = scan.next();

            String result = "Looks like your password has been expired for " + (2022 - year) +
                    ", but not to worry we will get it ready for you to travel to " +
                    country + ". Your total cost has come out to ";

            if (nextYear.equals("yes")) {
                costPassport += 100;
                result += costPassport +".";
            }else if (nextYear.equals("no")){
                costPassport -= 50;
                result += costPassport +".";
            }else {
                result = "Invalid input";
            }

            System.out.println(result);

        }else {
            System.out.println("Invalid input");
        }
        scan.close();


    }
}
/*
3. Create a class calledTravel. Make a cost variable to calculate how
much the person will owe after everything.
Ask the user if they have a valid passport (yes or no)
If the user enters yes:
The base cost of the ticket
should be set to: 1000
Ask the user the country they to travel to
(String, multiple word)
Ask the user how many bags they will take
with them (byte)
> Each bag will add 50 to the cost
Ask the user how many people they will travel
with (short)
> For each person the cost is
reduced by 100. Up to a limit of 300.
Ask the user to Enter the name of the people
they will travel with in one line, separating each name with a comma
(String, multiple word)
Print: "Your ticket is booked to
$countryName. We have charged extra for the $numberOfBags bags but you are
traveling with $peopleYouTravelWith so we are giving a discount. Your
total cost is $costAmount"
If the user enters no:
The base cost of the passport
renewal is: 200
            Ask the user when their passport
expired(int)
                > Each year it was
expired adds 75 to the cost
Ask the user which country they plan to
travel
            Ask the user if they will be
traveling in the next year (String - yes or no)
                > If yes: add 100 to
the cost
                > If no: subtract 50
from the cost
Print: "Looks like your password has
been expired for $years, but not to worry we will get it ready for you to
travel to $allCountries. Your total cost has come out to $costAmount."
 */