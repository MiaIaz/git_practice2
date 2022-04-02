package day10;

public class BiggerNum {
    public static void main(String[] args) {

        int n1=34;
        int n2=18;
        int n3=21;
        String result = (n1 > n2 && n1 > n3)?"n1 is the biggest"
                :(n2 > n1 && n2 >n3)?"n2 is the biggest"
                :"n3 is the biggest";
        System.out.println(result);

    }
}
/*
5. Create a class called BiggerNum, write a program that checks
 for the biggest of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is the biggest output: "n1 is bigger"
            if n2 is the biggest output: "n2 is bigger"
            if n3 is the biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY
 */
