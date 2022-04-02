package day35_Encapulation.pizzaTask;

public class PizzaObjects {

    public static void main(String[] args) {

        Pizza p1 = new Pizza("small", 2, 3);
        System.out.println("p1 = " + p1);

        Pizza p2= new Pizza("medium", 3, 5);

        System.out.println("p2 = " + p2);

        Pizza p3= new Pizza("large", 3, 5);

        System.out.println("p3 = " + p3);


    }

}
