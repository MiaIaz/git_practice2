package day20_Arrays;

import java.util.Arrays;

public class ArraysUtilities {
    public static void main(String[] args) {

        int[] numbers = {10, 9, 6, 4, 3, 10, 20, 7, 8};

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
