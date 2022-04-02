package week03;

public class LogicalOperators {
    public static void main(String[] args) {

        int i1 = 5;
        int i2 = 10;

        System.out.println( true | false); //true
        System.out.println( true || false); //true again, doesn't check the second part of the operator
        System.out.println(i2>i1 | i1>i2); //true

        System.out.println(i2>i1 || ++i1>i2);
        System.out.println("i1 = " + i1); //we will get 5
        
        
        boolean a = i2<i1 && i1<i2; //true && false
        System.out.println("a = " + a);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        
    }
}
