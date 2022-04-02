package day17_While_DoWhile_Loops;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {

        String str = "Java Java Java Java Python";

        int frequency = 0;

        while ( str.contains("Java") ){
            str = str.replaceFirst("Java", "");
            frequency ++;
        }

        System.out.println(frequency);


        System.out.println("=========================================");

        String sentence = " cat cat cat cat cat do dog cat dog cat dog";

        int countCat = 0;

        while(sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat", "");
            countCat++;
        }
        System.out.println(countCat);
    }
}
