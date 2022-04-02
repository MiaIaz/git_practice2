package week11;

import java.util.ArrayList;
import java.util.Arrays;

public class SomeUsefulMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6));

        list.remove(Integer.valueOf(1));
        System.out.println(list);

        System.out.println("=======================");

        String[] array = {"red", "green", "blue"};

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(array));
        System.out.println(list2);

        String[] array2 = new String[list2.size()];
        list2.toArray(array2);
        System.out.println(Arrays.toString(array2));

        System.out.println("==========================");
      /*
        int[] array3 = {1,2,3,4,5,6};

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(array3));


       */

        int[] array3 = {1,2,3,4,5,6};
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int each : array3) {
            list3.add(each);
        }
        System.out.println(list3);




    }
}
