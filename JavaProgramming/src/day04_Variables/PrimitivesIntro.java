package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        //age: 38 years old
        byte age = 38;

        //weight: 160 pounds
        // byte weight=160;-> 160 is out of byte's range
        //byte number=-129; //-129 is out of byte's range
        short weight=160; //160 is within the range of short

        //salary: 100000 $
        //short salary = 100000; //100000 is out of the short's range
        int salary = 100_000; //100000 is within the range of int
                             // int is the preferred data type for integer number

        long asset = 3_333_333_333L; //longer numbers use "long word description = numberL"



         //tax:0.26
        float tax = 0.26F;

        double PI = 3.14;

        // #
        char ch1= '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);
        
        char ch3 = 89;
        System.out.println("ch3 = " + ch3);
        
        char ch4 = 45000;
        System.out.println("ch4 = " + ch4);

        char gender = 'F';

        char great = 'F';

        char yesNo = 'Y';

        boolean isEmployed = true;
        boolean isMarried = false;
        boolean result = 100 < 300;
        boolean isAtHome = true;

        System.out.println("isEmployed = " + isEmployed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);
        System.out.println("isAtHome = " + isAtHome);

        String name = "Wooden Spoon";
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";

        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("country = " + country);


         double salaryAfterTax = 2.5;
        // int salaryAfterTax =










    }


}
