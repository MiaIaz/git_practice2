package day08_IfStatement;

public class GreatReport {
    public static void main(String[] args) {
/*
        System.out.println( true == !false); //true
        System.out.println( !true == !false); //false
        System.out.println( !false == true); // true

        System.out.println(!!false);//false
        System.out.println(!!!true); //false
 */
        int score = 38; //0--100
        boolean a = score >= 90 && score <= 100;
        //           false      &&    true
        boolean b = score >= 80 && !a; // if score is A, but greater than 89;
        boolean c = !a && !b;
        boolean d = !a && !b && !c;
        boolean f = !a && !b && !c && !d;

        if(a){
            System.out.println("Excellent");
        }

        if(b) {
            System.out.println("Great");
        }

        if(c) {
            System.out.println("Good");
        }
        if(d) {
            System.out.println("Passed");
        }

        if(f) {
            System.out.println("Failed");
        }




    }
}
/*
90--100 ===> Excellent
80--89 ====>Great
70--79===>Good
60--69===>Passed
0--59===>Failed
 */