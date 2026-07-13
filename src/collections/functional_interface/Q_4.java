package collections.functional_interface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Q_4 {

    public static void main(String[] args) {

        ArrayList<Employee1> list = new ArrayList<>();

        list.add(new Employee1(101, "Ram", 9000));
        list.add(new Employee1(102, "Sam", 12000));
        list.add(new Employee1(103, "Ravi", 8000));
        list.add(new Employee1(104, "Ajith", 15000));
        list.add(new Employee1(105, "Kiran", 7000));

        Predicate<Employee1> p = e -> e.getSalary() < 10000;

        System.out.println("Employees having salary less than 10000:");

        for (Employee1 e : list) {
            if (p.test(e))
                System.out.println(e.getName());
        }
    }
}