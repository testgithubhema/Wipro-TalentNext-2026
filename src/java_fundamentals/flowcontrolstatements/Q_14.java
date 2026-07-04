package java_fundamentals.flowcontrolstatements;
import java.util.*;
public class Q_14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=n;i>0;i=i/10) {
			sum=sum+i%10;
		}
		System.out.println(sum);
		sc.close();
	}

}
