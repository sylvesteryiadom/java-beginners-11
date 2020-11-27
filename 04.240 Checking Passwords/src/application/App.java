package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
//		final String USER_PASSWORD = "hello";
//		
//		System.out.print("Enter password > ");
//		
//		Scanner scanner = new Scanner(System.in);
//		String password = scanner.nextLine();
//		scanner.close();
//		
//		if(password.equals(USER_PASSWORD)) {
//			System.out.println("Access granted.");
//		}
//		else {
//			System.out.println("Access denied.");
//		}

		System.out.println("Welcome to the password checker\n");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a password: ");
		String passString = scanner.next();
		if (passString.length() > 6) {
			System.out.println("Access granted");
		} else {
			System.out.println("Password is too short");
		}
		
	}

}
