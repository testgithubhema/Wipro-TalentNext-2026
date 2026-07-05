package logic_building_hourplan.day2;
import java.util.Scanner;
public class conditional_statements_4 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=a+b;
		if(sum%2==0) {
			System.out.println("EVEN");
		}else {
			System.out.println("ODD");
		}
		sc.close();
	}
}
