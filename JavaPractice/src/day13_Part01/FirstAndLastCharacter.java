package day13_Part01;

public class FirstAndLastCharacter {
    public static void main(String[] args) {

        String s1 = "The cake is very yummy and sweet.";

        char firstChar = s1.charAt(0);
        System.out.println("firstChar = " + firstChar);

        char lasChar = s1.charAt(s1.length()-1);
        System.out.println("lasChar = " + lasChar);


    }
}
/*
1. write a program that asks user to enter a sentence.
then print the first & last characters of the sentence
 */