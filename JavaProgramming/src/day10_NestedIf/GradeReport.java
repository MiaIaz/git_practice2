package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        /*
        90~100: Excellent
        80~90: Great
        70~80: Good
        60~70: Passed
        0~59: Failed
         */

        int score= 60;
        String result = ""; //temporary

        if(score>=0 && score<=100){ //if the score is valid
            //5 possibilities:A, B, C, D, F

            if(score>=90) {
                result="Excellent";
            }else if(score>=80){
                result ="Great";
                }else if(score>=70){
                result= "Good";
            }else if(score>=60){
                result= "Passed";
            }else{
                result= "Failed";
            }

        }else{ //if the score is not valid
            //only 1 possibility
            result= "Invalid Score";
        }
        System.out.println(result);


        System.out.println("===========================");



    }
}
