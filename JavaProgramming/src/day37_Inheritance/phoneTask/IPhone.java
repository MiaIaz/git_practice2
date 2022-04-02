package day37_Inheritance.phoneTask;

public class IPhone extends Phone{

    public IPhone(String model, String colour, String size, double price){
        super("Apple", model, colour, size, price);
    }
    public void faceTime(long phoneNumber) {
        System.out.println(brand + " " + model + " is face timing by using the phone number " + phoneNumber);
    }
    public void faceTime(String email) {
        System.out.println(brand + " " + model + " is face timing by using the email " + email);
    }

    public String toString() {
        return "IPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
