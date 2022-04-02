package day23_Methods;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {

        anagram("silent", "listen");

    }

    public static void anagram(String firstAnagram, String secondAnagram) {

        char[] ch1 = firstAnagram.toCharArray();
        char[] ch2 = secondAnagram.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("The words are anagrams.");
        } else {
            System.err.println("The words are NOT anagrams");
        }
    }

}

/*
 17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram

 */