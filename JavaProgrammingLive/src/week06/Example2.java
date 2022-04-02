package week06;

public class Example2 {
    public static void main(String[] args) {
        for (int i = 3; i <130 ; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println("=====================");

        int countOfEven = 0;
        for (int i = 5; i <50 ; i++) {
            if(i%2 == 0) {
                ++countOfEven;
            }
            }
            System.out.println("Count of Even between 5 and 50 = "+countOfEven);
        }

    }


/*
Write a program that displays all odd numbers between 3-130
in the same line
 */