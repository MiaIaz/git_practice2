package day20_Arrays;

public class ReverseClassmateNames {
    public static void main(String[] args) {

        String[] classmates = {"Daniel Sirbu", "Emil Beyazortu",
                "Selma Koklu", "Ayse Koklu", "Guler Kemanci", "Ahmet Acik",
                "Athina Lioga", "Cigdem Onal", "Barbaros Hayreddin",
                "Mahmut Cuvoglu"};

        for (int i = classmates.length - 1; i >= 0; i--) {
            String name = classmates[i];
            String reverseName = "";

            for(int j = name.length()-1; j>=0; j--){
                reverseName += name.charAt(j);
            }
            System.out.println(reverseName);
        }

    }
}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each student's names and print them in separate lines.
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */