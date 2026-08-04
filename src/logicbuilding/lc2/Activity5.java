package logicbuilding.lc2;
import java.util.Scanner;
public class Activity5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i = 2;
        while (num % i != 0) {
            i++;
        }
        System.out.println("Smallest exact divisor is " + i);
        sc.close();
    }
}