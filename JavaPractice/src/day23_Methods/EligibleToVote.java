package day23_Methods;

import javax.swing.*;

public class EligibleToVote {
    public static void main(String[] args) {
eligibleToVote("usa", 21);


    }

    public static void eligibleToVote(String citizen, int age){
        if(age >= 19 && citizen.equalsIgnoreCase("USA")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible vote");
        }
    }
}
/*
4. create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!
 */