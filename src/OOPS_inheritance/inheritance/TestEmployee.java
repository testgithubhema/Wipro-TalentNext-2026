package OOPS_inheritance.inheritance;
public class TestEmployee {

    public static void main(String[] args) {

        Employee emp = new Employee(
                "Hema Sri",
                500000,
                2026,
                "NI12345");

        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());
    }
}
