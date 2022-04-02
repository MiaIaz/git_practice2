package day32_Constructor;

public class Car {

   public String brand, model;
   public int year;
   public double price;
   public String colour;

   public Car(String brand){
       this.brand = brand;
   }

   public Car(String brand, String model){
       this(brand);
       this.model= model;
   }

   public Car(String brand, String model, int year){
       this(brand, model);
       this.year = year;
   }

   public Car(String brand, String model, int year, double price){
       this(brand, model, year);
       this.price = price;
   }

   public Car(String brand, String model, int year, double price, String colour){
       this(brand, model, year, price);
       this.colour = colour;
   }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price= £" + price +
                ", colour='" + colour + '\'' +
                '}';
    }

    public static void main(String[] args) {

       Car car1 = new Car("Toyota");
       Car car2 = new Car("Audi","A7");
       Car car3 = new Car("BMW","X5",2019);
       Car car4 = new Car("Ford","Fiesta",2022,28000);
       Car car5 = new Car("Lexus","RX350",2019,43000,"Red");

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);
        System.out.println("car4 = " + car4);
        System.out.println("car5 = " + car5);

    }
}
