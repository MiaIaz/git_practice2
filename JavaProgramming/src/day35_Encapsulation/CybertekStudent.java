package day35_Encapsulation;

public class CybertekStudent {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public  String fieldOfStudy;

    public static String schoolName;
    public static String programmingLanguage;

    public CybertekStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName = "Cydeo";
        programmingLanguage = "Java";
    }

    public void attendClass(){
        System.out.println(name + " is attending " + schoolName);
    }

    public void study(){
        System.out.println(name + " is stunging " + programmingLanguage);
    }

    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
