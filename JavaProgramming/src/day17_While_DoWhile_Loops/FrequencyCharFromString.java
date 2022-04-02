package day17_While_DoWhile_Loops;

public class FrequencyCharFromString {
    public static void main(String[] args) {

        String str = "AAABBBC";
        char ch = 'A';

        int frequency = 0; //+1+1+1===>3

        for (int i = 0; i < str.length(); i++) { //i:indexes of the string(str)
            char eachChar = str.charAt(i); //eachChar:each character of the string(str)

            //'A'=='A'
            if (ch == eachChar) {//if given ch is matching with eachChar, then ch is appeared in string
                frequency++;
            }
        }
        System.out.println(frequency);
    }
}
