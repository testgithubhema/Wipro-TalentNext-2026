package logic_building_hourplan.day2;
import java.util.Scanner;
public class conditional_statements_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("EVEN");
		}else {
			System.out.println("ODD");
		}
		sc.close();
	}

}
