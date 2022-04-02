package day28_ArrayList;

import java.util.ArrayList;

public class LastElementToZero {

    public static void main(String[] args) {

        ArrayList<Integer>lastElement = new ArrayList<>();

        lastElement.add(1);
        lastElement.add(2);
        lastElement.add(3);
        lastElement.add(4);
        lastElement.add(5);

        lastElement.set(4,0);
        System.out.println(lastElement);


    }
}
/*
1. write a program that can set the last element of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];

 */