package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        /*
        String name = "James";
        String buildingNumber = "123456";
         */

        String name = "James King",
               buildingNumber = "12345B",
                streetName = "St George",
                city = "London",
                state = "Uk",
                zipCode = "LU2 0NP";

       // System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city +"\n" + state +"\n" + zipCode );

        String address01 = name + "\n" + buildingNumber + " " + streetName + "\n" + city +"\n" + state +"\n" + zipCode;
        System.out.println(address01);


        // System.out.println("This is " + name + " and this is his address " + ": " + buildingNumber +" ," + streetName + " ," + city +" ," + state +" ," + zipCode + ".");

        String address = "This is " + name + " and this is his address " + ": " + buildingNumber +" ," + streetName + " ," + city +" ," + state +" ," + zipCode + ".";
        System.out.println(address);





    }
}
/*
 Create a class called ShippingAddress.java
 Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full address

 */