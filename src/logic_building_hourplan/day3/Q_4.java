package logic_building_hourplan.day3;

public class Q_4 {

    public int secondLastDigit(int n) {

        n = Math.abs(n);

        if (n < 10)
            return -1;

        return (n / 10) % 10;
    }

    public static void main(String[] args) {
        Q_4 obj = new Q_4();
        System.out.println(obj.secondLastDigit(197));
    }
}