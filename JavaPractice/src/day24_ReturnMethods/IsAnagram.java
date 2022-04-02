package day24_ReturnMethods;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {

        String str1 = "cba";
        String str2 = "bac";

        System.out.println(isAnagram("cba","bac"));

    }

    public static boolean isAnagram(String str1, String str2){

        boolean isAnagram = false;
        char[] chr1 = str1.toCharArray();
        char[] chr2 = str2.toCharArray();

        Arrays.sort(chr1);
        Arrays.sort(chr2);


        if(Arrays.equals(chr1, chr2)){
            isAnagram = true;
        }
        return isAnagram;
    }
}
/*
2. create a method named isAnagram that passes two String parameters,
 the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true

 */
