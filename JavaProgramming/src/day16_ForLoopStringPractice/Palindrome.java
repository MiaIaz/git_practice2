package day16_ForLoopStringPractice;

import java.lang.ref.SoftReference;

public class Palindrome {
    public static void main(String[] args) {
        
        String word = "Mum";
        String reversed = "";

        for (int i = word.length()-1; i >=0 ; i--) {
           reversed += word.charAt(i);
        }

        boolean isPalindrome = word.equalsIgnoreCase(reversed);
        System.out.println("isPalindrome = " + isPalindrome);
    }
}
/*
"Java"-->"avaJ"-->false==no palindrome
"Anna"-->"annA"-->true
 */