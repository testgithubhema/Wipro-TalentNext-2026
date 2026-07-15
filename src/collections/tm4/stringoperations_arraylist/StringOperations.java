package collections.tm4.stringoperations_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class StringOperations {

    public static ArrayList<String> performOperations(String s1, String s2) {

        ArrayList<String> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        int j = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0)
                sb.append(s2);
            else
                sb.append(s1.charAt(i));
        }
        list.add(sb.toString());

        if (s1.indexOf(s2) != s1.lastIndexOf(s2)) {
            int last = s1.lastIndexOf(s2);
            String rev = new StringBuilder(s2).reverse().toString();
            list.add(s1.substring(0, last) + rev + s1.substring(last + s2.length()));
        } else {
            list.add(s1 + s2);
        }

        if (s1.indexOf(s2) != s1.lastIndexOf(s2)) {
            list.add(s1.replaceFirst(s2, ""));
        } else {
            list.add(s1);
        }

        int mid = (s2.length() + 1) / 2;
        String first = s2.substring(0, mid);
        String second = s2.substring(mid);
        list.add(first + s1 + second);

        String result = s1;
        for (char c : s2.toCharArray()) {
            result = result.replace(c, '*');
        }
        list.add(result);

        return list;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String 1:");
        String s1 = sc.nextLine();

        System.out.println("Enter String 2:");
        String s2 = sc.nextLine();

        ArrayList<String> list = performOperations(s1, s2);

        System.out.println(list);

        sc.close();
    }
}