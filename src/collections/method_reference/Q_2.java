package collections.method_reference;

public class Q_2 {

    public static void main(String[] args) {

        DigitInterface d = DigitCount::digitCount;

        System.out.println("Digits = " + d.count(123456));
    }
}