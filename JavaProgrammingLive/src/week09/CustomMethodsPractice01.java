package week09;

public class CustomMethodsPractice01 {
    public static void main(String[] args) {

        int personAge1 = 10;
        if(personAge1 >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible to buy");
        }

        int personAge2 = 20;
        if(personAge2 >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible to buy");
        }

        int personAge3 = 30;
        if(personAge3 >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible to buy");
        }

        System.out.println("=====================");

        eligibleOrNot(19);

    }

    public static void eligibleOrNot(int age){

        if( age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible to buy");
        }


    }
}
