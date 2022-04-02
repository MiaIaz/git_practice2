package day35_Encapulation.RectangleTask;

public class RectangleObjects {

    public static void main(String[] args) {

        Rectangle rc1=new Rectangle(2,4);

        System.out.println("rc1 = " + rc1);

        rc1.setLength(5);

        System.out.println("rc1.getLength() = " + rc1.getLength());

        System.out.println("rc1 = " + rc1);


    }

}
