package collections.functional_interface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Q_6 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Oracle");
        list.add("Spring");
        list.add("React");
        list.add("SQL");
        list.add("HTML");
        list.add("CSS");
        list.add("Cloud");
        list.add("Git");

        Consumer<String> c = s -> System.out.println(new StringBuilder(s).reverse());

        System.out.println("Reversed Words:");

        list.forEach(c);
    }
}