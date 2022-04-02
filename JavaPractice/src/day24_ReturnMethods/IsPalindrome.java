package day24_ReturnMethods;

import day13_part02.Reverse;

public class IsPalindrome {
    public static void main(String[] args) {

        String str = "Level";
        String reversed = reverse(str);
        System.out.println(reversed.equalsIgnoreCase(str));
    }
    public static String reverse(String search) {
        String result = "";
        char[] chr = search.toCharArray();
        for (int i = chr.length - 1; i >= 0; i--) {
            result += chr[i];
        }
        return result;
    }
 }
/*
4. By using the reverse method above to create another method named isPalindrome
that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true

 */