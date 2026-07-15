package collections.lambda_expressions;

import java.util.ArrayList;

public class Q_3 {

    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<>();

        a1.add("Java");
        a1.add("Python");
        a1.add("C");
        a1.add("Oracle");
        a1.add("Spring");
        a1.add("HTML");
        a1.add("CSS");
        a1.add("React");
        a1.add("SQL");
        a1.add("MongoDB");

        System.out.println("Strings with Odd Length:");

        a1.forEach(s -> {
            if (s.length() % 2 != 0)
                System.out.println(s);
        });
    }
}