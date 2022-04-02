package day28_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MultiplyOddNumbers {
    public static void main(String[] args) {


        ArrayList<Integer>multiplyOddNum = new ArrayList<>();
        multiplyOddNum.add(1);
        multiplyOddNum.add(2);
        multiplyOddNum.add(3);
        multiplyOddNum.add(4);
        multiplyOddNum.add(5);

        for (int i = 0; i < multiplyOddNum.size(); i++) {
            if (multiplyOddNum.get(i) % 2 != 0) {
                multiplyOddNum.set(i, multiplyOddNum.get(i) * 2);
            }
        }
        System.out.println(multiplyOddNum);
    }
}
/*
3. write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]
 */