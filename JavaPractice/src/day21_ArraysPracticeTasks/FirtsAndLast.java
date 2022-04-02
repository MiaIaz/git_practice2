package day21_ArraysPracticeTasks;

import java.util.Arrays;
import java.util.Scanner;

public class FirtsAndLast {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each item in one line

        //TODO: Write your code below

        String tmp[]= new String[words.length];

        for(int i=0 ; i < words.length ; i++)
        {
            tmp[i]=words[i].substring(0,1) + words[i].substring(words[i].length()-1) +"\n";
        }

        System.out.println(Arrays.toString(tmp));



    }
}