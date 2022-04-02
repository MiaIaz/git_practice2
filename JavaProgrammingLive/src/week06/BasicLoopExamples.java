package week06;

public class BasicLoopExamples {
    public static void main(String[] args) {
        /*
         * Question-1:

         Write a for loop that displays the following set of numbers:

         0,10,20,30,40,50,...1000

int i=0 : initialization
i<=1000 : condition
i+=10   :iteration
         */

        for (int i = 0; i < 1000; i+=10) {
            System.out.println(i+" ");
        }
        System.out.println();

        int z = 0;
        for ( ; z <=1000; ) {
            if (z % 10 == 0) {
                System.out.print(z+" ");
            }

            z++;

        }
    }
}
