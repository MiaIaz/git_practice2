package week09;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(add(5.2,20.5));
        double sum = add(4,5); //integer and the compiler did not complain
/*
DataType Parameter promotion
byte-->short-->int-->long-->double
 */
        System.out.println(sum);

        int sum2 =(int) add(4,5);

        System.out.println("100 * 200 = " + multiply(100,200));
    }

    public static double add(double num1, double num2){

        double result = num1 + num2;
        return result;
    }

    public static double subtract(double num1, double num2){
        double result2 = num1 - num2;
        return result2;
    }

    public static double multiply(double num1, double num2){
        return num1*num2;
    }

    public static double divide(double num1, double num2){
        return num1/num2;
    }

}
