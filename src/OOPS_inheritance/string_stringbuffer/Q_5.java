package OOPS_inheritance.string_stringbuffer;

import java.util.Scanner;
public class Q_5 {

	static String trimFirstLast(String str) {
		return str.substring(1, str.length()-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		
		System.out.println(trimFirstLast(str));
	}

}
