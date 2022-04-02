package day28_ArrayList;

import java.util.ArrayList;

public class FirstDuplicate {

    public static void main(String[] args) {

        ArrayList<Integer>firstDuplicated = new ArrayList<>();
        firstDuplicated.add(1);
        firstDuplicated.add(2);
        firstDuplicated.add(2);
        firstDuplicated.add(3);
        firstDuplicated.add(4);
        firstDuplicated.add(4);
        firstDuplicated.add(5);
        firstDuplicated.add(6);
        firstDuplicated.add(7);
        firstDuplicated.add(7);

        int frequency = 0;

        for (Integer each : firstDuplicated) {
            int firstDupl = 0;
            for (Integer element: firstDuplicated) {
                if(each == element){
                    firstDupl++;
                }
            }
            if(firstDupl > 1){
               frequency = each;
               break;
            }

        }
        System.out.println(frequency);

    }
}
/*
7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2

 */