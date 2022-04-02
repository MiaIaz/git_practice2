package week04;

public class AmazonFreeShipping {
    public static void main(String[] args) {

        double totalPrice =29;

        if(totalPrice>=25){
            System.out.println("Free Shipping Eligible. You order total: $" + totalPrice);
        }else{
            System.out.println("Not Eligible For Free Shopping: $" + totalPrice);
        }
        System.out.println("Thank you shopping with us");
    }
}
