package day26;

public class ReturnMinNumber {

    public static void main(String[] args) {
        minNumber(89,19);
    }

    public static int minNumber(int num1, int num2){

        int result =0;

        if(num1< num2){
            System.out.println(num1 + " is the smallest");
        }else{
            System.out.println(num2 + " is the smallest");
        }

        return result;

    }
    public static double minNumber(double num1, double num2){

        double result =0;

        if(num1< num2){
            System.out.println(num1 + " is the smallest");
        }else{
            System.out.println(num2 + " is the smallest");
        }

        return result;

    }
}
