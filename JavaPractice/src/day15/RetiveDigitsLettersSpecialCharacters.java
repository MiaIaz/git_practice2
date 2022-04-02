package day15;

import java.util.Scanner;

public class RetiveDigitsLettersSpecialCharacters {
    public static void main(String[] args) {

        String word = new Scanner(System.in).next();
        String digits = "";
        String letters = "";
        String specialChars = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch>='0' && ch<='9'){
                digits+=ch;
            }else if ((ch>='a' && ch<='z')
                    ||(ch>='A' && ch<='Z')) {
                letters+=ch;
            } else{
                specialChars+=ch;
            }
            
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);


    }
}
/*
5. write a program that can retive the digits, letters and special
characters from a string
Ex:
input:
mn@#123Ab!
output:
letters: mnAb
digits: 123
special chars: @#!
 */