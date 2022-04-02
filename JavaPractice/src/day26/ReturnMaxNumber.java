package day26;

public class ReturnMaxNumber {
    public static void main(String[] args) {

        numbers(10.9,90.6);
    }
    public static int maxNumber(int num1, int num2){

        int result = 0;
        if(num1 > num2){
            System.out.println(num1 + " is the biggest");
        }else{
            System.out.println(num2 + " is the biggest");
        }
        return result;
    }

    public static double numbers(double num1, double num2){

        double result = 0;
        if(num1 > num2){
            System.out.println(num1 + " is the biggest");
        }else{
            System.out.println(num2 + " is the biggest");
        }
        return result;
    }

}
