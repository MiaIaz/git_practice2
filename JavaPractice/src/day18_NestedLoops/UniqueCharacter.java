package day18_NestedLoops;

import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {

        System.out.println("Enter a string:");
        String word=new Scanner(System.in).next();
        String s1="";
        for (int i = 0; i <word.length() ; i++) {
            char ch=word.charAt(i);
            if(word.indexOf(ch)==word.lastIndexOf(ch))
                s1+=ch;
        }
        System.out.println(s1);
    }
}
/*
5. Write a program that can find the unique characters from a string
 without using index() and lastIndexOf() methods
    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf
      Hint: if you find out how to find the frequency of one character,
      then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique
 */