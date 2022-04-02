package day28_ArrayList;

import java.util.ArrayList;

public class CombineTwoArray {
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String>combine = new ArrayList<>();

        for (String each : arr1) {
            combine.add(each);
        }
        for (String each : arr2) {
            combine.add(each);
        }

        System.out.println("combine = " + combine);
    }
    
}
/*
4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */