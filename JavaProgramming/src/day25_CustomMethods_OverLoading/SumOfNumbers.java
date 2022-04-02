package day25_CustomMethods_OverLoading;

public class SumOfNumbers {

    public static void main(String[] args) {

        int sum = sumOf2Numbers(10,20);
        System.out.println("sum = " + sum);

        System.out.println("=========================");

        int sum2 = sumOf3Numbers(10,30,45);
        System.out.println("sum2 = " + sum2);

        System.out.println("============================");

        int sum3 = sumOf4Numbers(10,30,45,13);
        System.out.println("sum3 = " + sum3);

    }

    public static int sumOf2Numbers(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static int sumOf3Numbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    public static int sumOf4Numbers(int num1, int num2, int num3, int num4){
        return num1+num2+num3+num4;
    }

}
