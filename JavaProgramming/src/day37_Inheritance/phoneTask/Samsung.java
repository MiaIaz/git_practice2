package day37_Inheritance.phoneTask;

public class Samsung extends Phone{

    public Samsung( String model, String colour, String size, double price) {
        super("Samsung", model, colour, size, price);
    }
    public void freeze() {
        System.out.println(brand + " " + model + " is freezing ");
    }

    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
