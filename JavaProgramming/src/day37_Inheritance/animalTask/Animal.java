package day37_Inheritance.animalTask;

public class Animal {

    public String name, breed, size, colour;
    public int age;
    public char gender;

    public Animal(String name, String breed, String size, String colour, int age, char gender) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.colour = colour;
        this.age = age;
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name + " is drinking");
    }

    public void move(){
        System.out.println(name + " is moving");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


}
