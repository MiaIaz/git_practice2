package day37_Inheritance.animalTask;

public class Cat extends Animal{


    public Cat(String name, String breed, String size, String colour, int age, char gender) {
        super(name, breed, size, colour, age, gender);
    }

    public void scratch(){
        System.out.println(name + " is scratching");
    }
}
