package logic_building_hourplan.day3;

public class Q_3 {

    public int lastDigit(int n) {
        return Math.abs(n % 10);
    }

    public static void main(String[] args) {
        Q_3 obj = new Q_3();
        System.out.println(obj.lastDigit(-197));
    }
}