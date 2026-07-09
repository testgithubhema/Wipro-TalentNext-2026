package OOPS_inheritance.string_stringbuffer;
import java.util.Scanner;
public class Q_10 {

	static String lastRepeat(String str, int n) {
		String repStr = str.substring(str.length()-n);				
		String outStr = "";
		
		for(int i = 0; i  < n; i++) {
			outStr += repStr;
		}
		return outStr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		
		System.out.println(lastRepeat(str, n));
	}

}