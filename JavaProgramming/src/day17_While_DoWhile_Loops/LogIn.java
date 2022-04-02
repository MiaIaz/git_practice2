package day17_While_DoWhile_Loops;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String u = scan.next();

        System.out.println("Enter your password: ");
        String p = scan.next();

        if(u.equals("Cydeo") && p.equals("Cydeo123") ){
            System.out.println("Logged in");
        }else{
            int attempts = 3;

            while ( !(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts>0 ){
               if(attempts == 1){
                   System.out.println("THIS IS YOUR LAST CHANCE!");
               }
                System.out.println("Incorrect username and password, please re-enter:");
                System.out.println("Enter your username: ");
                u = scan.next();

                System.out.println("Enter your password:");
                p = scan.next();
                attempts--;
            }
            if(u.equals("Cydeo") && p.equals("Cydeo123")){
                System.out.println("Logged in");
            }else{
                System.out.println("Your account is locked.");
            }
        }

       scan.close();

    }
}
/*
//userName: Cydeo
//password: Cydeo123
 */