package OOPS_inheritance.string_stringbuffer;
import java.util.Scanner;
public class Q_1 {

	static boolean isPalindrome(String str) {
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1))
				return false;
			}
		return true;
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		
		if (isPalindrome(str))
			System.out.print("String is Palindrome");
		else
			System.out.print("String is not Palindrome");
		sc.close();
	}
}
