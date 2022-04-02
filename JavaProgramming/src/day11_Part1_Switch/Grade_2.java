package day11_Part1_Switch;

public class Grade_2 {
    public static void main(String[] args) {

        char ch = 'F';
        String result = "";

        switch (ch){
            case 'A': case 'B': case 'C': case 'D':
              result="Passed";
                break;
            case 'F':
                result="Failed";

            default:
                result="Invalid";

        }
        System.out.println(result);


    }
}
/*

if the grade is A or B or C ======>"Passed"
otherwise =====>Failed

 */