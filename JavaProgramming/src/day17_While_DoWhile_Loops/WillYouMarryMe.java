package day17_While_DoWhile_Loops;

import java.util.Scanner;

public class WillYouMarryMe {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me? Yes/ No");
        String a = scan.next().toLowerCase();

        while( !(a.equals("Yes") || a.equals("no")) ){
            System.out.println("Invalid answer, please re-enter");
            a = scan.next().toLowerCase();
        }

        if(a.equals("Yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Goodbye");
        }
    }
}
