package week09;

import java.util.Arrays;

public class BinarySearch_Arrays {

        public static void main(String[] args) {
            int[] nums={-5, 23, 123,654, 2344, 12345, 14421};

            int indexOne = Arrays.binarySearch(nums, 23); // ===>index of 23

            System.out.println("indexOne = " + indexOne);

            System.out.println(Arrays.binarySearch(nums, 2344)); // ===> index of 2344

            System.out.println(Arrays.binarySearch(nums, 25));

            if(Arrays.binarySearch(nums, 12786) >= 0){
                System.out.println("12345 is present in array");
            }else{
                System.out.println("12345 is not in the list");
            }


            System.out.println("===============================");

            int[] nums2 = {56, 3, -67, 100, 1000,75};
            Arrays.sort(nums2); //
            System.out.println(Arrays.binarySearch(nums2,100));
        }
    }



