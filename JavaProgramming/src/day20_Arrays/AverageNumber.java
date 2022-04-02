package day20_Arrays;

public class AverageNumber {
    public static void main(String[] args) {
        
        int[] numbers = {10, 23, 32, 45, 32, 50};
        
        double sum = 0; //10+......+50

        for (int i = 0; i < numbers.length; i++) {
           sum +=numbers[i];
        }
        
        double averageNumber = sum/numbers.length;
        //10/3==>3
        System.out.println("averageNumber = " + averageNumber);
    }
}
