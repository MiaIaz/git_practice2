package day28_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MaxNumber {

    public static void main(String[] args) {

        ArrayList<Integer>maxNum = new ArrayList<>();
        maxNum.add(1);
        maxNum.add(2);
        maxNum.add(3);
        maxNum.add(4);
        maxNum.add(5);

        int max = maxNum.get(0);

        for (Integer each : maxNum) {
            if (each > max) {
                max = each;
            }

        }
        System.out.println(maxNum);
        System.out.println(max);

        }
}
/*
5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5
 */