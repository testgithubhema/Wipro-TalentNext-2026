package logicbuilding.lc4;

import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string1: ");
		String str1=sc.nextLine();
		System.out.println("Enter string2: ");
		String str2=sc.nextLine();
		String str3=str1+str2;
		System.out.println("str3: "+str3);
		sc.close();

	}

}
