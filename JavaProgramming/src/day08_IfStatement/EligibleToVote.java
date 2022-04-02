package day08_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {

       String name = "Josh";
       int age = 38;
       String citizen = "USA";

       boolean isEligible = age >= 21 && citizen == "USA"; // True

       //Eligible
        if(isEligible){ // true
            System.out.println("Eligible");
        }



        //Not Eligible
        if(!isEligible){ // false===> not true===>!true
            System.out.println("Not Eligible");
        }

    }
}
