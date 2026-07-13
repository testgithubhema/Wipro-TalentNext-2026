package collections.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q_2 {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"Ram",23,"Pune"));
        list.add(new Employee(102,"Sam",24,"Hyderabad"));
        list.add(new Employee(103,"Ravi",25,"Pune"));
        list.add(new Employee(104,"Ajith",22,"Chennai"));
        list.add(new Employee(105,"Kiran",26,"Pune"));

        List<Employee> result = list.stream()
                .filter(e -> e.getLocation().equals("Pune"))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}