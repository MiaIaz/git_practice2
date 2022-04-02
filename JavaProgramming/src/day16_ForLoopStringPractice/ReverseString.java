package day16_ForLoopStringPractice;

import org.w3c.dom.css.CSSStyleRule;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Wooden Spoon";
        // index:     0123456....

        String result = ""; // contain the reverse version of the str
       // result += str.charAt(str.length()-1); //n

        for(int i = str.length()-1; i>=0;i--){
           result += str.charAt(i);

        }


        System.out.println(result);
    }
}
