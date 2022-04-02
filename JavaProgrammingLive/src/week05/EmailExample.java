package week05;

import java.util.Locale;
import java.util.Scanner;

public class EmailExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a valid email: craig_federighi@apple.com");
        String email = input.next();

        int indexOf = email.indexOf("_");
        int indexOfAtSign = email.indexOf("@");
        int indexOfDot = email.indexOf(".");
        String firstName = email.substring(0,indexOf);
        firstName = firstName.substring(0,1).toUpperCase(Locale.ROOT)+firstName
                .substring(1).toLowerCase();
        System.out.println("firstName = " + firstName);

        String lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        lastName = lastName.substring(0,1).toUpperCase(Locale.ROOT)+lastName.substring(1).toLowerCase();
        System.out.println("lastName = " + lastName);

        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
        System.out.println("domain = " + domain);

    }
}
