package IO_operations.tm501;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        File file = new File("employee.txt");

        while (true) {

            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");

            int ch = sc.nextInt();

            switch (ch) {

            case 1:

                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Employee Age: ");
                int age = sc.nextInt();

                System.out.print("Enter Employee Salary: ");
                double salary = sc.nextDouble();

                FileWriter fw = new FileWriter(file, true);
                fw.write(id + " " + name + " " + age + " " + salary + "\n");
                fw.close();

                break;

            case 2:

                System.out.println("----Report----");

                BufferedReader br = new BufferedReader(new FileReader(file));

                String line;

                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }

                br.close();

                System.out.println("----End of Report----");

                break;

            case 3:
                sc.close();
                System.exit(0);
            }
        }
    }
}