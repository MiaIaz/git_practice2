package day10;

public class GradeLevel {
    public static void main(String[] args) {

        byte number = 15;
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


    }
}
/*
1. Create a class called GradeLevel,
Given a number(byte) grade level determine and
print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

      NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
