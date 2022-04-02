package week03;

public class EvenOrOdd {
    public static void main(String[] args) {
        //Task:--- find if a give integer is even number or odd number
        //Hint: use % operator, and control flow statement

        int number = 100;

        if(number % 2 == 0){
            System.out.println("The number is even!");
        }
        else{
            System.out.println("The number is odd!");
        }


        int number1= 9;
        boolean condition = number1 % 2== 0;
        System.out.println("condition = " + condition);

    }
}
