package week03;

public class SomeExtraTasks {
    public static void main(String[] args) {

        int b = 2;
        boolean res = ++b == 2|| --b==2 && --b==2;// false(b:3), 2==2(true), 1==2(false)--->false
        boolean res1 = ++b == 2|| --b==2 || --b==2; //true
        System.out.println(res);
        System.out.println(res1);



    }
}
