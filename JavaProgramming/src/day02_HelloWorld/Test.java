package day02_HelloWorld;

import day24_CustomMethod_Return.ReturnMethodPractice4;
import day24_CustomMethod_Return.ReturnMethodsIntro;

public class Test {

    public static void main(String[] args) {

        String str = "aaaaaaaaaaaabbbbbbbbbbbbb";

       str = ReturnMethodPractice4.removeDuplicates(str);

        System.out.println(str);

        String name = "Java Programming";
        String reversedName = ReturnMethodsIntro.reverse(name);
        System.out.println(reversedName);
    }
}
