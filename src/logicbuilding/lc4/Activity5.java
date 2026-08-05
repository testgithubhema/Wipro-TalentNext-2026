package logicbuilding.lc4;

import java.util.Scanner;

public class Activity5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string1: ");
		String str1=sc.nextLine();
		System.out.println("Enter string2: ");
		String str2=sc.nextLine();
		String rev=" ";
		for(int i=str2.length()-1;i>=0;i--) {
			rev=rev+str2.charAt(i);
		}
		String str3=str1+rev;
		System.out.println("String3:"+str3);
		sc.close();
		

	}

}
