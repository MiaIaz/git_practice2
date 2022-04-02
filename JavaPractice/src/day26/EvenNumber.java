package day26;

public class EvenNumber {
    public static void main(String[] args) {

        isEven(9);
    }

    public static int isEven(int num){

        if(num%2 == 0){
            System.out.println("Num is even");
        }else{
            System.out.println("Num is odd");
        }
        return num;
    }

}
/*
2.8 Create a method that can check if an integer is even number
 */