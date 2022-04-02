package day15_ForLoops;

import java.util.Locale;

public class FormatFullName {
    public static void main(String[] args) {

        String firstName = "cyDEo";
        String lastName = "SCHOOL";

       firstName = firstName.substring(0, 1).toUpperCase(Locale.ROOT)
                + firstName.substring(1).toLowerCase();
        System.out.println(firstName);


        lastName = lastName.substring(0, 1).toUpperCase(Locale.ROOT)
                + lastName.substring(1).toLowerCase();

        System.out.println(lastName);
        String fullName = firstName + " "+ lastName;

        System.out.println("fullName = " + fullName);
    }
}
