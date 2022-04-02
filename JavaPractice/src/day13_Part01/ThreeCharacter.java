package day13_Part01;

import java.util.Scanner;

public class ThreeCharacter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        scan.close();

        int lenght = word.length();
        String result = "";

        if (lenght == 0) {
            System.out.println("String is Empty");
        } else if (lenght > 3) {
            int lastIndex = word.length() - 1;
            result = "" + word.charAt(lenght - 3) + word.charAt(lenght - 2) + word.charAt(lenght - 1);
        } else {
            result = word;
        }

        System.out.println(result);

    }
}
/*
5. Write a method that asks user to enter a string.
if the string is empty, print: string is empty
if the string has more than 3 characters, print the last three
characters
if the string has less than or equal 3 characters, print the
string itself
 */