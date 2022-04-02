package day15_ForLoops;

public class ForLoopPractice {
    public static void main(String[] args) {

        for(int i = 15; i <=45; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Hello");

        for(int i2 = 100; i2 >=50; --i2){
            System.out.print(i2+" ");
        }
        System.out.println();

        System.out.println("====================");

        for(int i3 = 1; i3 <= 55; i3++){
            if(i3 % 2 == 0){
                System.out.println(i3+ "");
            }

        }
        System.out.println();

        System.out.println("================");

        for(int i = 2; i <=54; i +=2){
            System.out.println(i+"");
        }

        System.out.println("=============");

        for(char i = 'A'; i <= 'Z'; i++){
            System.out.println(i+ " ");
        }

        System.out.println();

        for(char i ='a'; i<='z'; i++){
            System.out.println(i+" ");
        }

        System.out.println();

        for(char i ='z'; i>='a'; i--){
            System.out.println(i+" ");
        }
        System.out.println("==================");
        for(char i ='Z'; i>='A'; i--){
            System.out.println(i+" ");
        }

    }
}
