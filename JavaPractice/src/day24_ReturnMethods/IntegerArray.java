package day24_ReturnMethods;

public class IntegerArray {
    public static void main(String[] args) {

        int frequency = frequency(new int[]{1,1,1,1,1,2,2},2);

        System.out.println("frequency = " + frequency);

    }

    public static  int frequency(int[] array, int repeatNumber){

        int count = 0;
        for (int each : array) {
            if (each == repeatNumber){
                count ++;
            }

        }
        return count;
    }
}
/*
 5. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5
 */