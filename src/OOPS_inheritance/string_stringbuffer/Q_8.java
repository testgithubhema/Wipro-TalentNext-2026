package OOPS_inheritance.string_stringbuffer;
import java.util.Scanner;
public class Q_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		
		String[] stars = str.split(".[\\*]+.");
		
		StringBuffer sb = new StringBuffer();
		
		for (String x : stars)
			sb.append(x);
		
		System.out.println(sb);

	}

}
