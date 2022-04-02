package day23_Methods;

public class DollarEuro {
    public static void main(String[] args) {

        convert(100);

    }

    public static void convert(double dollarAmount){
        double euro = dollarAmount * 1.13;
        System.out.println(dollarAmount+" dollar equal to "+euro+" euro");
    }

}
/*
9. create a method that can convert dollar to euro
 */
