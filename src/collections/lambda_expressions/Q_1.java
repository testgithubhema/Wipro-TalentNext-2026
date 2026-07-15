package collections.lambda_expressions;

import java.util.ArrayList;
import java.util.Random;

public class Q_1 {

    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>();
        Random r = new Random();

        // Add 25 random numbers (1-100)
        for (int i = 0; i < 25; i++) {
            a1.add(r.nextInt(100) + 1);
        }

        System.out.println("Numbers:");
        System.out.println(a1);

        System.out.println("Prime Numbers:");

        a1.forEach(n -> {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        });
    }

    public static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}