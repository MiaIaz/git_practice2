package day05_Concatenation;

public class FullName02 {

    public static void main(String[] args) {
        String firstName = "Mia";
        String lastName = "Iaz";
        int age = 33;
        String jobTitle = "SDET";
        String companyName = "Amazon";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;

        System.out.println("This is " + fullName + ".");
        System.out.println(fullName + " is " + jobTitle + " and she is " + age + " years old " + "." );
        System.out.println("She works at " + companyName + " and her salary is $" + salary + ".");

    }
}
/*
FullName is JobTitle, works at CompanyName. and FullName, Salary is
 */