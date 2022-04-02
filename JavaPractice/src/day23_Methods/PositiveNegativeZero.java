package day23_Methods;

public class PositiveNegativeZero {

    public static void main(String[] args) {
        numPosNegZer(-6);

    }
    public static void numPosNegZer(int number){

        if(number > 0){
            System.out.println("Number is positive");
        }else if(number == 0){
            System.out.println("Number is Zero");
        }else{
            System.out.println("Number is negative");
        }
    }

}
/*
12. create a method that can if the given integer is positive, negative or zero
 */
