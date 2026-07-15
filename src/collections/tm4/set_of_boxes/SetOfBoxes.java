package collections.tm4.set_of_boxes;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetOfBoxes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Box> set = new TreeSet<>((b1, b2) ->
                Double.compare(b1.getVolume(), b2.getVolume()));

        System.out.println("Enter the number of Box");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter the Box " + i + " details");

            System.out.println("Enter Length");
            double l = sc.nextDouble();

            System.out.println("Enter Width");
            double w = sc.nextDouble();

            System.out.println("Enter Height");
            double h = sc.nextDouble();

            set.add(new Box(l, w, h));
        }

        System.out.println("Unique Boxes in the Set are");

        for (Box b : set) {
            System.out.println(b);
        }

        sc.close();
    }
}