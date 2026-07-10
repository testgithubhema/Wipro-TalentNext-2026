package abstraction_packages_exceptionhandling.exception_handling;
import java.util.Scanner;

class InvalidCountryException extends Exception {
	public InvalidCountryException() {
		System.out.println("InvalidCountryException occured");
		System.out.println("User Outside India cannot be registered");
	}
}

public class Q_4 {

	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("India"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");	
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = "", countryName = "";
		System.out.print("Enter the name of user :");
		name = scan.nextLine();
		System.out.print("Enter country name :");
		countryName = scan.nextLine();
		Q_4 registration = new Q_4();
		try {
			registration.registerUser(name, countryName);
		} 
		catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}

}