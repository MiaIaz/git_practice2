package day37_Inheritance.animalTask;

public class Dog extends Animal{

    public Dog(String name, String breed, String size, String colour, int age, char gender){
        super(name, breed, size, colour, age, gender);
    }
    public void bark(){
        System.out.println(name + " is barking");
    }
}
