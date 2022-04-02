package day32_Constructor;

public class CarpetObjects {
    public static void main(String[] args) {

        Carpet capet1 = new Carpet(3,5,6,true);
        Carpet capet2 = new Carpet(6,10,3,false);
        Carpet capet3 = new Carpet(19,21,10,true);

        System.out.println("capet1 = " + capet1);
        System.out.println("capet2 = " + capet2);
        System.out.println("capet3 = " + capet3);
    }
}
