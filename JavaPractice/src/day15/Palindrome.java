package day15;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();
        scan.close();
        String reverse ="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);
        }
        boolean palindrome = (str.equals(reverse))?true:false;
        System.out.println(palindrome);



    }
}
/*
8. Write a program that can check if the given String is palindrome
Ex:
input:
Level
output:
true
input:
Anna
output:
true
 */