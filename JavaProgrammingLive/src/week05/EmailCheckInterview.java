package week05;

import java.util.Scanner;

public class EmailCheckInterview {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                System.out.println("enter e mail");
                String email = scan.next();
                int at = email.indexOf("@");
                int dot = email.indexOf(".c");
                boolean v = at >= 1 && dot >= (at + 2);
                if (v) {
                    System.out.println(v);
                } else {
                    System.out.println("false");
                }
                scan.close();


            }
        }
/*
Your team has created a new bank website that requires email address to be validated.
The email string must contain an '@' character.
The email string must contain an '.' character.
The '@' must contain at least one character in front of it.
e.g. "a@example.com" is valid while "@example.com" is invalid.
The '.' and '@' must be in the appropriate places.
e.g. "mike.smith@com" is invalid while "mike.smith@example.com" is valid.
For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.
Examples:
str = "test@example.com" --> true
str = "test@example.co.in --> true
str = "@example.com" --> false
 */