package logicbuilding.lc3;

import java.util.Scanner;

public class Activity1 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int numbers[]=new int[10];
		int sum=0;
		for(int i=0;i<10;i++) {
			System.out.print("Enter number: ");
			numbers[i]=sc.nextInt();
			sum=sum+numbers[i];
		}
		System.out.println("Sum= "+sum);
		sc.close();

	}

}
