package logic_building_hourplan.day2;
import java.util.Scanner;
public class conditional_statements_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		sc.close();

	}

}
