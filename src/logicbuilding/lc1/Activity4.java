package logicbuilding.lc1;
import java.util.*;
public class Activity4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			System.out.print("Enter a number: ");
			int num=sc.nextInt();
			if(num==0) {
				System.out.println("Zero");
			}else if(num%2==0) {
				System.out.println("Even");
			}else {
				System.out.println("Odd");
			}
		}
		sc.close();

	}

}
