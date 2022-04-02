package day18_Nested_Loop;

public class DivedTwoNumbers {
    public static void main(String[] args) {

        int a = 30;
        int b = 7;

        int count = 0;

        while(a >= b){
            a -= b;
            count++;
        }
        System.out.println(count+ " with the remainder of "+ a);
    }
}
