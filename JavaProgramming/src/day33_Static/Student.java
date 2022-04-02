package day33_Static;

import java.util.Arrays;

public class Student {

    public String name, gender;
    public int age, studentID;
    public char grade;

    public Student(String name){
        this.name = name;
    }
    public Student(String name, String gender){
        this(name);
        this.gender = gender;
    }
    public Student(String name,int studentID){
        this(name);
        this.studentID = studentID;
    }
    public Student(String name, int studentID, char grade){
        this(name, studentID);
        this.grade = grade;
    }
    public Student(String name, String gender, int age){
        this(name, gender);
        this.age = age;
    }
    public Student(String name, String gender, int age, int studentID){
        this(name, gender, age);
        this.studentID = studentID;
    }
    public Student(String name, String gender, int age, int studentID, char grade){
        this(name, gender, age, studentID);
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }


}
