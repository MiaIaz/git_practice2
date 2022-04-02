package day36_Inheritance.AnimalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max","Dalmatian", "Large", "Black", 7);
        dog.eat();
        dog.sleep();
        dog.drink();
        dog.bark();
        dog.move();

        System.out.println("dog = " + dog);
        
        Cat cat = new Cat();
        cat.setInfo("Bibu","British", "small", "White",3);
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.scratch();

        System.out.println("cat = " + cat);
        
        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", "Small", "Orange", 4);
        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        tiger.run();
        tiger.hunt();

        System.out.println("tiger = " + tiger);



    }
}
