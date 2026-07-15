package collections.tm4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeRegister {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> list = new ArrayList<>();

        System.out.println("Enter the Number of Employees");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter Employee " + i + " Details:");

            System.out.println("Enter the Firstname");
            String firstName = sc.nextLine();

            System.out.println("Enter the Lastname");
            String lastName = sc.nextLine();

            System.out.println("Enter the Mobile");
            long mobile = sc.nextLong();
            sc.nextLine();

            System.out.println("Enter the Email");
            String email = sc.nextLine();

            System.out.println("Enter the Address");
            String address = sc.nextLine();

            list.add(new Employee(firstName, lastName, mobile, email, address));
        }

        Collections.sort(list, new EmployeeComparator());

        System.out.println("\nEmployee List:");
        System.out.format("%-15s %-15s %-15s %-30s %-15s%n",
                "FirstName", "LastName", "Mobile", "Email", "Address");

        for (Employee e : list) {
            System.out.format("%-15s %-15s %-15d %-30s %-15s%n",
                    e.getFirstName(),
                    e.getLastName(),
                    e.getMobileNumber(),
                    e.getEmail(),
                    e.getAddress());
        }

        sc.close();
    }
}