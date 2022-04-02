package week05;

public class StringReview01 {
    public static void main(String[] args) {

        String str1 = "Java"; //literal way of creating
        //string object increased in the HEAP memory, there is a special place
        // called"String Pool".

        String str2 = "Java";// literal
        System.out.println(str1 == str2);// true:THE Reason: both str1 and str2
                                          //-references are pointing to the same object in the memory.


        String str3 = new String("Java");
        System.out.println(str1 == str3);// false--->the reason: str1 and str3 are pointing
                                         //-to a different objects
        // what does equals() method do? checking for the value of the object
        System.out.println((str1.equals(str3))); //true

    }
}
