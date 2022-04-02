package day23_Methods;

public class KgInLb {
    public static void main(String[] args) {
        kgToLb(10);
    }

    public static void kgToLb(double Kg) {
        double pound = 2.205;
        double lb = pound * Kg;
        System.out.println("lb = " + lb);
    }
}

/*
11. create a method that can convert kg to lb
 */