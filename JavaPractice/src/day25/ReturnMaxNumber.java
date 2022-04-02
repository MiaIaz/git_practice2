package day25;

import java.util.Arrays;

public class ReturnMaxNumber {
    
    public static int maxNumber(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
    public static double maxNumber(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
    public static long maxNumber(long[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
    public static short maxNumber(short[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
    public static float maxNumber(float[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
    public static byte maxNumber(byte[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
}
/*
Task 2:
	1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array


 */