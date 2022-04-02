package day16;

import java.util.Scanner;

public class CatAndDog {
    public static void main(String[] args) {
        System.out.println("Enter a sentence:");
        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.toLowerCase().substring(i).startsWith("dog")) {
                cat++;
            }
            if (sentence.toLowerCase().substring(i).startsWith("cat")) {
                dog++;
            }
        }
        System.out.println(cat == dog);
    }
}
/*
5. write a program to print true if the string "cat" and "dog"
appear the same number of times in the given sentence
        Ex:
            sentence = "caT dog dogG cAt"
            output:
                true
 */