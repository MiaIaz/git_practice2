package day26;

public class OddNumber {

    public static void main(String[] args) {
        oddNumber(7);
    }
    public static int oddNumber(int number){

        if(!(number%2 == 0) ){
            System.out.println("Number is odd");
        }else{
            System.out.println("Number is even");
        }
        return number;
    }
}
