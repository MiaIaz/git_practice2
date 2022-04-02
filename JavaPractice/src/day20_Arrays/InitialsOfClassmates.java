package day20_Arrays;

import java.util.Arrays;

public class InitialsOfClassmates {

    public static void main(String[] args) {

        String[] classmates = {"Daniel Sarbu", "Emil Beyazortu",
                "Selma Koklu", "Ayse Koklu", "Guler Kemanci", "Ahmet Acik",
                "Athina Lioga", "Cigdem Onal", "Barbaros Hayreddin", "Mahmut Cuvoglu"};

        for (int i = 0; i < classmates.length; i++) {
            String initial = classmates[i].charAt(0)+ "." +
                    classmates[i].charAt(classmates[i].indexOf(" ")+1);

            System.out.println(initial);

        }


    }
}
/*
1. create an array named classmates, and store 10 of your classmates'
 full names print the initials of each classmate's in separate lines

 */