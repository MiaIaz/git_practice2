package day37_Inheritance.animalTask;

public class Parrot extends Animal{


    public Parrot(String name, String breed, String size, String colour, int age, char gender) {
        super(name, breed, size, colour, age, gender);
    }

    public void fly(){
        System.out.println(name + (" is flying"));
    }
    public void sing(){
        System.out.println(name + (" is singing"));
    }
}
