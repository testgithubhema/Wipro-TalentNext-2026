package logicbuilding.lc2;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		while(num>0) {
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("The output is "+sum);
		sc.close();

	}

}
