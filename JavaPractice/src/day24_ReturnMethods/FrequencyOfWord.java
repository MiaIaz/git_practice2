package day24_ReturnMethods;

public class FrequencyOfWord {
    public static void main(String[] args) {

        System.out.println(frequencyOfWord("Java java java python python", "java"));
    }


    public static int frequencyOfWord(String sentence, String word) {

        int count = 0;
        while(sentence.contains(word)){
            sentence = sentence.toLowerCase();
            sentence = sentence.replaceFirst(word, "");
            count++;
        }
        return count;


    }

}
/*
	1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word,
	 then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */
