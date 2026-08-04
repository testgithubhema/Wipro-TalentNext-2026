package logicbuilding.lc1;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		for(int i=1;i<=3;i++) {
			System.out.print("Enter marks: ");
			int marks=sc.nextInt();
			if(marks>=35) {
				count++;
			}
		}
		System.out.println("Number of students that have passed the exam:"+count);
		sc.close();
			

	}

}
