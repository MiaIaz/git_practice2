package day17_While_DoWhile_Loops;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        String str = "Cat Cat Dog Cat Dog Dog Cat Cat Cat Cat Cat Cat Dog";

        int frequency = 0;

        for (int i = 0; i <= str.length()-3; i++) {
            String eachSub = str.substring(i, i+3);

            if (eachSub.equalsIgnoreCase("Cat")){
                frequency +=1;
            }
        }
        System.out.println(frequency);
    }
}
