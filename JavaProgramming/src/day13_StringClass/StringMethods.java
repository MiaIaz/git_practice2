package day13_StringClass;

public class StringMethods {
    public static void main(String[] args) {
        
        String word = "Cydeo";
        
        char thirdChar = word.charAt(3);
        System.out.println("thirdChar = " + thirdChar);
        
        char tenthChar = word.charAt(2);
        System.out.println("tenthChar = " + tenthChar);

        System.out.println("===========================");
        
        String s1 = "Batch 25 is the best batch. Java Programming Language!";
        int totalChar = s1.length();
        System.out.println("totalChar = " + totalChar);

        char lasChar = s1.charAt(s1.length()-1);
        System.out.println("lasChar = " + lasChar);

        System.out.println("=============================");

        String str = "wooden spoon";
        str = str.toUpperCase();//---->"WOODEN SPOON"

        System.out.println(str);

        String s = "JAVA";
        s = s.toUpperCase();
        System.out.println(s);

        String str1 = "JAVA";
        str1 = str1.toLowerCase();
        System.out.println(str1);

        
    }
}
