package collections.method_reference;

public class Q_3 {

    public static void main(String[] args) {

        PrimeInterface p = PrimeCheck::new;

        p.create(17);
        p.create(20);
    }
}