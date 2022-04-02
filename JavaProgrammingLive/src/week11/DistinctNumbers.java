package week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DistinctNumbers {
    //it will input from user, and only will store distinct numbers to our arrayList

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter integers (input ends with 0) : ");

        int value = 0;

        do{
            value = input.nextInt();
            if(!list.contains(value) && value != 0){
                list.add(value);
            }

        }while(value != 0);
        for (Integer each : list) {
            System.out.print(each + " ");
        }
        System.out.println();

        System.out.println("The size of the array = " +list.size());

        Collections.sort(list);
        System.out.println(list);

        Collections.max(list);
        System.out.println(list);

        Collections.min(list);
        System.out.println(list);



    }
}
