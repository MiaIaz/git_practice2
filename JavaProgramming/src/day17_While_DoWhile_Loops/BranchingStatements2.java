package day17_While_DoWhile_Loops;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E' ; i++) {

            if(i=='C'){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("====================");

        //print all the even numbers 1~10;

        for (int i = 1; i <= 10 ; i++) {
            if(i%2 !=0){
                continue;
            }
            System.out.print(i+ " ");

        }
        System.out.println();
        System.out.println("======================");

        //print all the odd numbers 1~10;
        for (int i = 1; i <= 10 ; i++) {
            if(i%2==0){
                continue;
            }
            System.out.print(i+ " ");

        }
    }
}
