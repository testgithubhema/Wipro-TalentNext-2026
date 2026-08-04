package logicbuilding.lc2;
import java.util.Scanner;
public class Activity4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int num = sc.nextInt();
        int decimal = 0;
        int place = 1;
        while (num > 0) {
            int rem = num % 10;
            decimal = decimal + rem * place;
            num = num / 10;
            place = place * 2;
        }
        System.out.println("Decimal value is " + decimal);
        sc.close();
    }
}