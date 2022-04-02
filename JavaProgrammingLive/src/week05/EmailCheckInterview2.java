package week05;

import java.util.Scanner;

public class EmailCheckInterview2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please put a valid email address: ");
        String email = input.next();

        boolean result = true;

        int atSignIndex = email.indexOf("@");
        int dotIndex = email.lastIndexOf("@");

        if(atSignIndex < 1 || atSignIndex >= email.length()-3
                           || atSignIndex!= email.lastIndexOf("@")){
            result = false;

        }
        if(dotIndex <1 || dotIndex == email.length()-1
                       || atSignIndex > dotIndex
                       || atSignIndex +1 == dotIndex){
            result=false;
        }
        System.out.println("result = " + result);


    }
}
