package day11_Part2_Scanner.day12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        byte number = 10;
        String school = "";

        if(number>=1 && number<=18){
            if(number<=5){
                school=("Elementary School ");
            }else if(number<=8){
                school=("Middle School");
            }else if(number<=12){
                school=("High School");
            }else if(number<=16){
                school=("College");
            }else{
                school=("Grand School");
            }
        }else{
            school="Invalid grade level given";
        }
        System.out.println(school);


        System.out.println("===================================");

        byte number1 = 17;
        String result = "";

        if(number1>=1 && number1<=18){
            switch (number1){
                case 6:case 7:case 8:
                    result="Middle school";
                    break;
                case 9:case 10:case 11:case 12:
                    result = "High school";
                    break;
                case 13: case 14:case 15:case 16:
                        result = "College";
                        break;
                case 17: case 18:
                    result = "Grad School";
                    break;
                default:
                    result ="Elmentery School";
            }

        }else {
            System.out.println("Invalid Grade");

        }

        System.out.println(result);

    }
}
