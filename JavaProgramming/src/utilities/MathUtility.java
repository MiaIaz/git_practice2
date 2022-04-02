package utilities;

public class MathUtility {

//Sum of two numbers integer/double:
   //1.
    public static int sum(int num1, int num2){
        return num1 + num2;
    }
   //2.
    public static double sum(double num1, double num2){
        return num1 + num2;
    }


//Subtraction of two numbers integer/double:
   //3.
    public static int subtract(int num1, int num2){
        return  num1 - num2;
    }
   //4.
    public static double subtract(double num1, double num2){
        return  num1 - num2;
    }


//Multiplication of two numbers integer/double:
   //5.
    public static int multiplication(int num1, int num2){
        return num1 * num2;
    }
   //6.
    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }


//Division of two numbers integer/double:
   //7.
    public static int division(int num1, int num2){
    return  num1/ num2;
    }
   //8.
    public static double division(double num1, double num2){
        return  num1/ num2;
    }


//Odd number:
   //9.
    public static boolean isOdd(int num){
        return (num%2!=0)? true: false;
    }


//Even number:
    //10.
    public static boolean isEven(int num){
        return (num%2==0)? true: false;
    }


//Max number integer/double:
    //11.
    public static int max(int num1, int num2){
        return (num1>num2) ? num1 : num2;
    }
    //12.
    public static double max(double num1, double num2){
        return (num1>num2) ? num1 : num2;
    }


//Min number integer/double:
    //13.
    public static int min(int num1, int num2){
        return (num1<num2) ? num1 : num2;
    }
    //14.
    public static double min(double num1, double num2){
        return (num1<num2) ? num1 : num2;
    }


//Square integer/double:
    //15.
    public static int square(int num){
        return num * num;
    }
    //16.
    public static double square(double num){
        return num * num;
    }


//Cube integer/double:
    //17.
    public static int cube(int num){
        return num * num * num;
    }
    //18.
    public static double cube(double num){
        return num * num * num;
    }

}
