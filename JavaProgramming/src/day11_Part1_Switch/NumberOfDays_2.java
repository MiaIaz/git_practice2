package day11_Part1_Switch;

public class NumberOfDays_2 {
    public static void main(String[] args) {

        int number = 3;

        if(number>=1 && number<=12){

            switch (number){

                case 2:
                    System.out.println("28days");
                    break;

                case 4: case 6: case 9: case 11:
                    System.out.println("30days");
                    break;

                default:
                    System.out.println("31days");
                    break;

            }
        }else{
            System.out.println("Invalid Number");
        }
    }
}
