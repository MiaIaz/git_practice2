package day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {
        
        Dog dog1 = new Dog("Max","Dalmatian","Large", "Brown", 4, 'M');
        System.out.println("dog1 = " + dog1);
        
        Cat cat1 = new Cat("Bob","British", "Small","White", 2, 'F');
        System.out.println("cat1 = " + cat1);

        Parrot parrot1 = new Parrot("Kind", "Macaw", "Small", "Green", 5, 'M');
        System.out.println("parrot1 = " + parrot1);
        
    }
    
}
