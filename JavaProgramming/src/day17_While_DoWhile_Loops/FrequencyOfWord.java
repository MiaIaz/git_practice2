package day17_While_DoWhile_Loops;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str = "BreadBreadBreadBreadBread";

        int frequency = 0;

        for (int i = 0; i <= str.length()-5; i++) { //i: 0, 1, 2, 3, 4
           String eachSub = str.substring(i,i+5);
            //System.out.println(eachSub);

            if(eachSub.equals("Bread")){
                frequency +=1;
            }

        }
        System.out.println(frequency);
    }
}
