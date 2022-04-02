package day37_Inheritance.phoneTask;

public class Nokia extends Phone{

    public Nokia( String model, String colour, String size, double price) {
        super("Nokia", model, colour, size, price);
    }

    public void selfDefense() {
        System.out.println(brand + " " + model + " as self defenses tool.");

    }

    public String toString() {
        return "Nokia{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
