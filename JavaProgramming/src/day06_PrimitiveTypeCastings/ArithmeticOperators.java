package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("12" + 1);//121, concatenation
        System.out.println(10 + 20); //30, addition
        System.out.println(100 - 50); //50, subtraction
        System.out.println(5 * 6); //60, multiplication


        System.out.println( 100 / 3); //33
        System.out.println( 100.0 / 3); //33.333....
        System.out.println( 100 / 3.0); //33.333....
        System.out.println( 100d / 3); //33.333....
        System.out.println( 100 / 3d); //33.333....

        System.out.println( 10 / 4); //2
        System.out.println( 10.0 / 4); //2.5
        System.out.println( 10 / 4.0); //2.5
        System.out.println( 10d / 4); //2.5
        System.out.println( 10 / 4d); //2.5

        int a = 100;
        double b = a/6;
        System.out.println(b);

        int a1 = 100;
        double b1 = a/6d;
        double b2 = (double)a/6;
        System.out.println(b1);
        System.out.println(b2);


        System.out.println( 100D);






    }

}
/*
+:Addition
-:Subtraction
*:Multiplication
/:Division
        in math: 10/4=2.5
                 100/3 =33.3333

        in java: 10/4=2
                 10.0/4=2.5
                 100/3=33
                 100.0/3 = 33.333.....
%:Remainder

 */