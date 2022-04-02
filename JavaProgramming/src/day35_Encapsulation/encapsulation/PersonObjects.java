package day35_Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();
       // p1.name = "Daniel";
       // p1.name = 28;

        p1.setName("Daniel");
        p1.setAge(28);

        p2.setName("Mia");
        p2.setAge(33);

        System.out.println(p1.getName()+ " : " + p1.getAge());
        System.out.println(p2.getName()+ " : " + p2.getAge());

    }

}
