package day23_Methods;

public class BuyAlcohol {

    public static void main(String[] args) {
       buyAlcohol(21);

    }

    public static void buyAlcohol(int age){
        if(age >= 18){
            System.out.println("Eligible to buy alcohol.");
        }else{
            System.out.println("Not eligible to buy!");
        }
    }


}
/*
   3. create a method that can check if a person is eligible to buy alcohol
 */