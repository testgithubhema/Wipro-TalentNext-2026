package logic_building_hourplan.day3;

public class Q_1 {

    public int isEven(int n) {
        return (n % 2 == 0) ? 2 : 1;
    }

    public static void main(String[] args) {
        Q_1 obj = new Q_1();
        System.out.println(obj.isEven(10));
    }
}