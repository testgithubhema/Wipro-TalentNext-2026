package logic_building_hourplan.day3;

public class Q_2 {

    public int isOdd(int n) {
        return (n % 2 != 0) ? 2 : 1;
    }

    public static void main(String[] args) {
        Q_2 obj = new Q_2();
        System.out.println(obj.isOdd(7));
    }
}