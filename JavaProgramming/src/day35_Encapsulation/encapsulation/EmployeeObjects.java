package day35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Mia",'F', 33, 45985);
        employee1.setAge(32);
        System.out.println(employee1);

    }
}
