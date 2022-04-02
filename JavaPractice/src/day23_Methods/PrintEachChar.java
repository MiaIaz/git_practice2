package day23_Methods;

public class PrintEachChar {
    public static void main(String[] args) {

        printEachChar("aabbccdd");

    }

    public static void printEachChar(String word){

        String characters = "";
        for (int i = 0; i < word.length(); i++) {
            characters += word.charAt(i) + " ";
        }
        System.out.println(characters);

    }


}
/*
13. create a method named printEachChar that can print each characters of a string
 */
