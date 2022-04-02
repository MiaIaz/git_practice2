package week03;

public class Grater {
    public static void main(String[] args) {
        /*for a given grade assign Letter Grade: 100:90(inclusive):
        A
        B= 89-80
        C=79-70
        D=69-60
        Below is Fail

         */

        int score = 44;
        // do sanity check
         if(score<90 && score >= 90){
            System.out.println("A");
        }
        else if(score<80 && score >= 70){
            System.out.println("B");
        }
        else if(score<70 && score >= 60){
            System.out.println("C");
        }
        else if(score<60 && score >= 50){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }

    }
}
