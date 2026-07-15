package logic_building_hourplan.day3;

public class Q_5 {

    public int addLastDigits(int input1, int input2) {

        input1 = Math.abs(input1);
        input2 = Math.abs(input2);

        return (input1 % 10) + (input2 % 10);
    }

    public static void main(String[] args) {
        Q_5 obj = new Q_5();
        System.out.println(obj.addLastDigits(267, 154));
    }
}