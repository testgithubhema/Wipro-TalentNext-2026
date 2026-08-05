package logicbuilding.lc3;
import java.util.Scanner;
public class Activity4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[30];
        int count[] = new int[101];
        for (int i = 0; i < 30; i++) {
            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
            count[marks[i]]++;
        }
        for (int i = 0; i <= 100; i++) {
            if (count[i] > 0) {
                System.out.println(i + " marks = " + count[i] + " students");
            }
        }
        sc.close();
    }
}