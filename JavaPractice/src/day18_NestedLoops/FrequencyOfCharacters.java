package day18_NestedLoops;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "AAABBBCCCDDDDDDDDD";
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        String str1 = "";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='A'){
                countA++;
            }
            if(str.charAt(i)=='B'){
                countB++;
            }
            if(str.charAt(i)=='C'){
                countC++;
            }
            if(str.charAt(i)=='D'){
                countD++;
            }
        }

        System.out.print("A= "+countA +" B= "+countB +" C= "+countC +" D= "+countD);

    }
}
/*
4. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


       Hint: if you find out how to find the frequency of one character,
        then repeat it for all the remaining characters

 */