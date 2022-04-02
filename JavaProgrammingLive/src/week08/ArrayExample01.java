package week08;

import java.util.Arrays;

public class ArrayExample01 {
    public static void main(String[] args) {

        int code =  200;

        int[] codes = new int[8];
        System.out.println(Arrays.toString(codes));

        codes[0]=200;
        codes[1]=201;
        System.out.println(Arrays.toString(codes));

        int[] statusCodes = {200,201,204,400,401,403,404,500};

        System.out.println(Arrays.toString(statusCodes));

        System.out.println("-----------size of an array-----------------");

        //String str = "Java"; str.length()---> size of the string

        //for arrays
        System.out.println("the size of our array: " + statusCodes.length);
        //is the length that gets no parameter and returns an integer

        int sizeOfArray = statusCodes.length; //8, use it for creating loops

        System.out.println("===================");

        String[]responseTypes = new String[]{"OK", "Created", "No created",
                "Bad request", "Unauthorized", "Forbidden", "Not found",
                "Internal Server Error"};
        for(int i = 0; i< sizeOfArray; i++){
            String text = statusCodes[i] + " : " + statusCodes.length;
            System.out.println("Each Status Code means: " + text);
        }

    }
}
