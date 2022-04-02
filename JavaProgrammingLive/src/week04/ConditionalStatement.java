package week04;

import java.util.Scanner;

public class ConditionalStatement {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        String result = "";

        switch (name) {
            case "Chen":
                System.out.println("teacher");
                break;

            default:
                System.out.println("student");
        }
        System.out.println(result);

    }
}
