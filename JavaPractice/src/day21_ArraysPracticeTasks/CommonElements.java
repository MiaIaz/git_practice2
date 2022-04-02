package day21_ArraysPracticeTasks;

public class CommonElements {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        for (int each : arr1) {

            for (int element : arr2) {

                if (each == element) {
                    System.out.println(each + " ");
                }
            }

        }
        System.out.println();

        System.out.println("======================");

       String s1 = "abc";
       String s2 = "abc";
        System.out.println("s1==s2 is:"+ s1==s2);


    }
}
/*
3. Write a program that can print out the common
 elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops
 */