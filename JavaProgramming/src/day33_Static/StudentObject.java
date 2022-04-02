package day33_Static;

import java.util.Arrays;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("Mia");
        Student student2 = new Student("Mia","female");
        Student student3 = new Student("Mia",2345735);
        Student student4 = new Student("Mia",2345735,'B');
        Student student5 = new Student("Mia","female",33);
        Student student6 = new Student("Mia","female",33,2345735);
        Student student7 = new Student("Mia","female",33,2345735,'B');

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("student3 = " + student3);
        System.out.println("student4 = " + student4);
        System.out.println("student5 = " + student5);
        System.out.println("student6 = " + student6);
        System.out.println("student7 = " + student7);

        Student[] students = {student1,student2,student3,student4,student5,student6,student7};
        System.out.println(Arrays.toString(students));

    }
}
