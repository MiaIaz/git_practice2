package day23_Methods;

public class Calculator {
    public static void main(String[] args) {
        calculator(15,3,'/');

    }

    public static void calculator(int num1, int num2, char mathOperator){

        int result = 0;
        if(mathOperator == '+'){
            System.out.println(num1 + num2);
        }else if(mathOperator == '-'){
            System.out.println(num1 - num2);
        }else if(mathOperator == '*'){
            System.out.println(num1 * num2);
        }else if(mathOperator == '/'){
            System.out.println(num1 / num2);
        }
        System.out.println("result = " + result);
    }


}
/*
15. create a method named calculator that passes three arguments (num1, num2, mathOperator),
prints the calculation result
 */
