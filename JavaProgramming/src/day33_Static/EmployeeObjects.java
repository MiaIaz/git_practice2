package day33_Static;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Ahmet";

        Employee employee2 = new Employee();
        employee2.name = "Natalia";

        Employee employee3 = new Employee();
        employee1.name = "Mia";

        System.out.println("employee1 = " + employee1.name);
        System.out.println("employee2 = " + employee2.name);
        System.out.println("employee3 = " + employee3.name);


        int a = 100;

        a = 200;

        a = 300;


    }
}
