package day23_Methods;

public class EvenNumber2 {
    public static void main(String[] args) {

      evenNumber();

    }

    public static void evenNumber() {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i+ " ");
            }

        }
        System.out.println();
    }
}
/*
2. create a method that can print even numbers between 1~100 in a same line spread by space
 */