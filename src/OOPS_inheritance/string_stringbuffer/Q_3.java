package OOPS_inheritance.string_stringbuffer;
import java.util.Scanner;
public class Q_3 {

	static String copyString(String str) {
		String repStr = str.substring(0, 2);				//substring(beginIndex, endIndex)
		String outStr = "";
		
		for (int i = 0; i < str.length(); i++) {
			outStr += repStr;
		}
		return outStr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		
		System.out.println(copyString(str));
	}

}
