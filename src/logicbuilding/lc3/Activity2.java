package logicbuilding.lc3;

import java.util.Scanner;

public class Activity2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[20];

        for (int i = 0; i < 20; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < 20; i++) {
            for (int j = i + 1; j < 20; j++) {

                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Minimum 3: " + a[0] + " " + a[1] + " " + a[2]);

        System.out.println("Maximum 3: " + a[19] + " " + a[18] + " " + a[17]);

        sc.close();
    }
}