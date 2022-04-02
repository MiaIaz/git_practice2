package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("Iphone 10", "Black", "Small", 896.50);
        System.out.println("iPhone = " + iPhone);

        Samsung samsung = new Samsung("Galaxy S21", "Black", "Medium", 1150.45);
        System.out.println("samsung = " + samsung);

        Nokia nokia = new Nokia("Nokia 3110", "White", "Large", 899.99);
        System.out.println("nokia = " + nokia);

        iPhone.call(911);
        iPhone.text(12456432);
        iPhone.faceTime(348746829);
        iPhone.faceTime("m.iaz@gmail.com");

        System.out.println("==================================");

        samsung.call(25763735);
        samsung.text(53755187);
        samsung.freeze();

        System.out.println("=====================================");

        nokia.call(6457259);
        nokia.text(645575247);
        nokia.selfDefense();




    }
}
