package day10;

import java.util.Enumeration;

public class CrewAndPassengers {
    public static void main(String[] args) {

        int passengers=75;
        String total = "";
        boolean validNumber= passengers==50 || passengers==75 || passengers==100;


        if(validNumber){

            if(passengers==50){
                total= "20 crew, 30 passengers";
            }else if(passengers==75){
                total="25crew, 50 passengers";
            }else{
                total="30 crew, 70 passengers";
            }

        }else{
            total="Invalid number";
        }

        System.out.println(total);



    }
}
/*
2. Create a class called CrewAndPassengers,
 Given a number of people on the ship (int number),
 determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
