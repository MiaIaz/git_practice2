package week05;

public class JavaCode {
    public static void main(String[] args) {

        String today = "I coded a lot of [] today";
        String word = today.substring(today.indexOf("["));
        System.out.println("word="+word);
    }
}
