package day33_CutomClass_Statics;

public class IphoneTest {

    public static void main(String[] args) {

        Iphone iPhone = new Iphone("iphone 12", "Black", 1000, "5.6 inches");

        System.out.println(iPhone);

        iPhone.faceTime(123456789);
        iPhone.faceTime("gmail@yahoo.com");
        iPhone.call(123456789);
        iPhone.text(123456789);


    }
}
