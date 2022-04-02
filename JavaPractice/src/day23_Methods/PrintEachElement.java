package day23_Methods;

public class PrintEachElement {
    public static void main(String[] args) {
        printEachElement();
    }
    public static void printEachElement (){

            int[][][] array3D = {{{1,2,3},{4,5,6}}, {{7,8,9},{10,11,12,13}}};
            for (int[][] each2DArray : array3D) {
                for (int[] eachArray : each2DArray) {
                    for (int eachElement : eachArray) {
                        System.out.print(eachElement + " ");
                    }
                }
            }
    }

}
/*
14. create a method named printEachElement that can print each element of an integer array

 */
