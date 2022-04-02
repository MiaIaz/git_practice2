package day15;

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
/*
7. Write a program that can reverse any given string
Ex:
input:
Wooden Spoon
output:
noopS nedooW
 */