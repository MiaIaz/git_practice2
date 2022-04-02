package day08_IfStatement;

import jdk.swing.interop.SwingInterOpUtils;

public class LogicalOperators {
    public static void main(String[] args) {
        // &&-->both
        // ||-->either

        String name = "Daniel";
        int age = 34;
        String citizen = "North Korea";
        boolean isEligible = age >= 18 && citizen == "USA";
        //                  19 >= 18 && "UK" == "USA";
        //                  true && false ===> false

        System.out.println(name +  " is eligible to vote: " + isEligible);

        System.out.println("===========================================");

        String name2 = "Josh";
        int creditScore = 620;
        int age2 = 23;
        int income = 40000;

        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 60000;
        System.out.println(name2 + "is eligible for loan " + isEligible2);


        System.out.println("------------------------------");
        System.out.println("                               ");

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        //                    21 >= 18 && ( 'F' == || 'F' == 'F' );
        //                    true     && ( false  || true );
        //                    true     &&   true;
        //                    true;

        System.out.println(name3 + "is eligible to register: " + isEligible3);
        System.out.println("------------------------------------------");

        String name4 = "James";
        String countryOfBirth = "USA";
        boolean marriedToUSCitizen = false;
        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;
//                             false                  || false
        System.out.println(name4 + " is eligible to apply for US citizen ship: " + isEligible4);

        System.out.println("------------------------");
        String student = "Anna";
        double gpa = 2.5;
        int familyIncome = 100000;
        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;
        System.out.println(student + "is eligible for schoolship: "+ isEligible5);

        System.out.println("------------------");
        
        boolean result2 = true;
        System.out.println("result2 = " + result2);
        
        boolean result3 = !result2;
        System.out.println("result3 = " + result3);

        System.out.println("------------------");

        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("failed = " + failed);
        System.out.println("passed = " + passed);

        System.out.println("==============================");





    }
}

