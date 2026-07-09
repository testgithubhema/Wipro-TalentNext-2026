package OOPS_inheritance.string_stringbuffer;
import java.util.Scanner;
public class Q_4 {

	static String firstHalfString(String str) {
		if(str.length() % 2 == 0)
			return str.substring(0, str.length()/2);
		else 
			return "null";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		
		System.out.println(firstHalfString(str));
	}

}
