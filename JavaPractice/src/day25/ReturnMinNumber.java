package day25;

import java.util.Arrays;

public class ReturnMinNumber {
    
    public static int minNumber(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }
    public static double minNumber(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }
    public static long minNumber(long[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }
    public static short minNumber(short[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }
    public static float minNumber(float[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }
    public static byte minNumber(byte[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

}
/*
Task 3:
	1. create a method that can return the min number from an integer array

	2. create a method that can return the min number from double array

	3. create a method that can return the min number from long array

	4. create a method that can return the min number from short array

	5. create a method that can return the min number from float array

	6. create a method that can return the min number from byte array

 */