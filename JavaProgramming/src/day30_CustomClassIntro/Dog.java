package day30_CustomClassIntro;

public class Dog {

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String colour;

    public void setInfo(String dogName, String dogBreed,int dogAge, char dogGender, String dogSize, String dogColour){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        colour = dogColour;

    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    public void bark(){
        System.out.println(name + " is barking.");
    }

}
/*
Attributes:
    -name, age, colour, breed, size, gender
Actions:
    -eat(), play(), bark()..........
 */