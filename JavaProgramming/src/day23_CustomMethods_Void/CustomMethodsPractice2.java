package day23_CustomMethods_Void;

public class CustomMethodsPractice2 {

    public static void main(String[] args) {
       helloWorld5Times();
     System.out.println("=====================");
       helloCydeo5Times();
     System.out.println("====================");
        evenNumbers();
    }
    //1. creat a function that can print "Hello word" 5 times===>helloWorld5Times

    public static void helloWorld5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world!");
        }
    }

    //2. creat a function that can print "Hello Cydeo" 5 times==>helloCydeo5Times

    public static void helloCydeo5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");
        }
    }


//3. create a function that can print all the even numbers from 1~10===>evenNumbers

    public  static  void evenNumbers(){
        for (int i = 2; i < 11; i+=2) {
            System.out.print(i+",");
        }
    }




}
