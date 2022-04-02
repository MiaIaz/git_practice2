package day15;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int oddSum = 0;
        for (int i = 1; i <=100 ; i++) {
            if(i % 3 == 0){
                oddSum +=i;
            }
            System.out.println("oddSum = " + oddSum);
        }

    }
}
/*
2. Write a program that can return the sum of odd numbers between 1
to 100
 */