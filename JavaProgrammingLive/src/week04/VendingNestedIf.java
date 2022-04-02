package week04;

public class VendingNestedIf {
    public static void main(String[] args) {

        String selection = "drink";
        String drinkItem ="coffee";
        String snackItem = "chips";


        if (selection == "drink"){
            System.out.println("Drink option is selected");
            if (drinkItem == "Tea"){
                System.out.println(" Tea item selected");
            }else if (drinkItem=="coffee"){
                System.out.println("Coffee item selected");
            }else {
                System.out.println("No drink selected");
            }
        }else if (selection == "snack"){
            if (snackItem == "chips"){
                System.out.println("Chips item selected");
            }else if (snackItem == "chocolate"){
                System.out.println("Chocolate item selected");
            }else if (snackItem == "popcorn"){
                System.out.println("Popcorn item selected");
            }else {
                System.out.println("No snack selected");
            }
        }else {
            System.out.println("invalid entry");
        }
    }
}
