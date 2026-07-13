package collections.functional_interface;

import java.util.ArrayList;
import java.util.function.Function;

public class Q_1 {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Ram", "Hyderabad", 50000));
        list.add(new Employee(102, "Sam", "Chennai", 45000));
        list.add(new Employee(103, "Ravi", "Bangalore", 55000));
        list.add(new Employee(104, "Kiran", "Pune", 60000));
        list.add(new Employee(105, "Ajith", "Mumbai", 70000));

        Function<ArrayList<Employee>, ArrayList<String>> fun = empList -> {
            ArrayList<String> locations = new ArrayList<>();

            for (Employee e : empList) {
                locations.add(e.getLocation());
            }

            return locations;
        };

        ArrayList<String> locationList = fun.apply(list);

        System.out.println("Employee Locations:");
        for (String loc : locationList) {
            System.out.println(loc);
        }
    }
}