package week05;

public class StringReview02 {
    public static void main(String[] args) {
        /*
        length:it doesnt take parameters, it returns an integer number
         */
        String message = "EU8 is Awesome!!";
        int count = message.length();
        System.out.println("how may characters we can have: "+count);
        System.out.println(count==16);
        if(message.length()==16){
            System.out.println("Happy testing");


        }
    }
}
