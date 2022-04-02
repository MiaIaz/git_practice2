package day12;

import java.util.Scanner;

public class PeopleInHouse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many people lives in the house with you?");

        int people = scan.nextInt();
        String result = "";
        result = (people<3)?"Live with less than 3 people"
                : (people<=6)?"Live with 3-6 people"
                : "Live with more than 6 people";
        System.out.println(result);
        scan.close();

    }
}
/*
1. Ask the user how many people they live with:
if user lives with Less than 3 people: print "Live with less
than 3 people"
if the user lives with 3 - 6 people: print "Live with 3 - 6
people"
if the user lives with more than 6 people: print "Live with
"more than 6 people"
 */