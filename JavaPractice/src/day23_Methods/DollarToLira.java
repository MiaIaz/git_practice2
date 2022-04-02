package day23_Methods;

public class DollarToLira {
    public static void main(String[] args) {

        dollarToLira(100);

    }

    public static void dollarToLira(double dollarAmount){

        double lira = dollarAmount * 13.85;
        System.out.println(dollarAmount+" dollar equal to "+lira+" lira");


    }

}
/*
10. create a method that can can convert dollar to lira

 */
