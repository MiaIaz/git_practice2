package day28_ArrayList;

import java.util.ArrayList;

public class LatElementWithFirst {

    public static void main(String[] args) {

        ArrayList<Integer> lastElementWithfirst = new ArrayList<>();

        lastElementWithfirst.add(1);
        lastElementWithfirst.add(2);
        lastElementWithfirst.add(3);
        lastElementWithfirst.add(4);
        lastElementWithfirst.add(5);

        lastElementWithfirst.set(0,5);
        lastElementWithfirst.set(4,1);
        System.out.println(lastElementWithfirst);



    }
}
/*
2. write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];

 */