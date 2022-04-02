package day35_Encapulation.candyTask;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {

        Candy c1 = new Candy("KitKat", 5,0.5, false);
        Candy c2 = new Candy("Bueno", 3,1.5, true);
        Candy c3 = new Candy("Kingo", 2,0.5, false);
        Candy c4 = new Candy("Toblerone", 4,2.5, true);
        Candy c5 = new Candy("Dido", 1,0, false);

        ArrayList<Candy> candies = new ArrayList<>(Arrays.asList(c1,c2,c3,c4,c5));

        for (Candy candy : candies) {
            System.out.println(candy.getBrand() + " : $" + candy.getPrice());
        }
    }



}
