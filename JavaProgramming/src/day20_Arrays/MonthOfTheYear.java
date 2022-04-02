package day20_Arrays;

import java.util.Arrays;

public class MonthOfTheYear {
    public static void main(String[] args) {

        String[] months ={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.println(Arrays.toString(months));
/*
        int num = 23;
        if(num<1 || num>12){
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println( months[num-1] );

 */

        for (int i = 0; i < months.length; i ++) { //i:represents the index numbers of array starting from 0
            System.out.println( months[i] );
        }

        System.out.println("----------------------");

        for (int i = months.length-1; i >= 0; i--) { //i:represents the index numbers of array starting from last index
            System.out.println( months[i] );
        }
    }
}
