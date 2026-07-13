package collections.functional_interface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Q_5 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(7);
        list.add(9);
        list.add(10);
        list.add(16);
        list.add(20);
        list.add(25);
        list.add(30);
        list.add(36);
        list.add(50);

        Predicate<Integer> p = n -> {
            int r = (int) Math.sqrt(n);
            return r * r == n;
        };

        System.out.println("Perfect Square Numbers:");

        for (int n : list) {
            if (p.test(n))
                System.out.println(n);
        }
    }
}