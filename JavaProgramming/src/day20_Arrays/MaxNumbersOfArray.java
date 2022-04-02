package day20_Arrays;

public class MaxNumbersOfArray {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 13, 6};
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println(max);

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println(min);



    }
}

