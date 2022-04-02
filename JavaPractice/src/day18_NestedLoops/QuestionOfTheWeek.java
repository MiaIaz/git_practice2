package day18_NestedLoops;

public class QuestionOfTheWeek {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println();
        System.out.println("==========================");


        for(int i = 1; i <= 5; i++)
        {
            for(int k = 5; k >= i; k--)
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
                System.out.print(" ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("==========================");

        for (int i=0; i<5; i++) {

            for (int j = 2 * (5 - i); j >= 0; j--) {

                System.out.print(" ");
            }

            for (int b = 0; b <= i; b++) {

                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
/*
Questions of the week: Print out the patterns below:

*
* *
* * *
* * * *
* * * * *

    *
   * *
  * * *
 * * * *
* * * * *

        *
      * *
    * * *
  * * * *
* * * * *
 */