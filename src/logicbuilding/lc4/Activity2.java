package logicbuilding.lc4;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=sc.nextLine();
		String res=" ";
		boolean vowelFound=false;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				res=res+'z';
				vowelFound=true;
			}else {
				res=res+ch;
			}
		}
		if(vowelFound) {
			System.out.println("Result: "+res);
		}else {
			System.out.println("No vowels present");
			System.out.println("Original String: "+str);
		}
		sc.close();

	}

}
