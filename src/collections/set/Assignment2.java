package collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class Assignment2 {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Ajith");
        employees.add("Sam");
        employees.add("Maara");
        employees.add("Kris");

        System.out.println("Employee Names:");

        Iterator<String> itr = employees.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}