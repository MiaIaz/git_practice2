package day37_Inheritance.phoneTask;

public class Phone {

    public String brand;
    public String model;
    public String colour;
    public String size;
    public double price;


    public static boolean hasBattery = true;

    public Phone(String brand, String model, String colour, String size, double price) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.size = size;
        this.price = price;
    }

    public void call(long phoneNumber){
        System.out.println(brand + " " + model + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber){
       System.out.println(brand + " " + model + " is texting " + phoneNumber);
   }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
