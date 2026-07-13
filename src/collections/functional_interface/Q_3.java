package collections.functional_interface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Q_3 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("madam");
        words.add("level");
        words.add("java");
        words.add("radar");
        words.add("apple");
        words.add("wow");
        words.add("hello");
        words.add("malayalam");
        words.add("racecar");
        words.add("book");

        Predicate<String> p = s -> s.equals(new StringBuilder(s).reverse().toString());

        System.out.println("Palindrome Words:");

        for (String str : words) {
            if (p.test(str))
                System.out.println(str);
        }
    }
}