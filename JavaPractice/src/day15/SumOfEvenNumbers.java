package day15;

public class SumOfEvenNumbers {
    public static void main(String[] args) {

        int evenSum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 ==0){
                evenSum += i;
            }
            System.out.println("evenSum = " + evenSum);

        }

    }
}
/*
1. Write a program that can return the sum of even numbers between 1
to 100
 */