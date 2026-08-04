package logicbuilding.lc2;
import java.util.*;
public class Activity1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("The output is "+count+" digits");
		sc.close();
	}

}
