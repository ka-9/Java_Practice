package Account_Login.V1;

// To do list:
// create  a class for password
// create a class for account + array
// Insert try catchers

import java.util.Scanner;

public class AccountManager {
	public static void main (String[] args) {

		boolean charStatus = false;
		boolean numberStatus = false;
		int charTrue = 0;
		int numberTrue = 0;
		String passwordVerf;

		Scanner scan = new Scanner(System.in);

		System.out.println("Hello, User. Let's start by creating an account." + "\n" + "Please enter your first name: ");
		String firstName = scan.nextLine();

		System.out.println("Welcome, " + firstName + ". Please enter your last name: ");
		String lastName = scan.nextLine();

		System.out.println("Kindly precise your age: ");
		int age = scan.nextInt();
		scan.nextLine();

		String accountNb = ((int) (Math.random() * 90000001) + 10000000) + "";
		System.out.println("This account number was generated for you: " + accountNb);
		try{Thread.sleep(2000);}
					catch(InterruptedException e)
					{System.out.println(e);} 
			

		System.out.println("Please enter a secure password of 12 characters minimum including at least 1 number and 1 special character (@ # $ % &): ");
		String password = scan.nextLine();
		while (password.length() < 12) { 
				System.out.println("Your password is too short. Please enter a new one.");
				password = scan.nextLine();
		}
		
		while (charStatus == false || numberStatus == false) {
			for (int counter1 = 0; counter1 < password.length(); counter1++) {
				charStatus = (password.charAt(counter1) == '@' || password.charAt(counter1) == '#' || password.charAt(counter1) == '$' || password.charAt(counter1) == '%' ||
 password.charAt(counter1) == '&'); //The for loop is overwriting the value of charStatus when it is true thus the program was only working when the special char is at the end
					if (charStatus == true) {
						charTrue += 1;
					}

				numberStatus =  (password.charAt(counter1) == '0' || password.charAt(counter1) == '1' || password.charAt(counter1) == '2' || password.charAt(counter1) == '3' || 
password.charAt(counter1) == '4' || password.charAt(counter1) == '5' || password.charAt(counter1) == '6' || password.charAt(counter1) == '7' || password.charAt(counter1) == '8' ||
password.charAt(counter1) == '9');
					if (numberStatus == true) {
						numberTrue += 1;
					}
				
			}

			if (charTrue > 0 && numberTrue > 0) {
				System.out.println("Enter the password again: ");
				passwordVerf = scan.nextLine();

				while (password.equals(passwordVerf) == false) {				
					System.out.println("The password you enter does not match. Please enter it again.");
					passwordVerf = scan.nextLine();
				}

				charStatus = true;
				numberStatus = true;
				System.out.println("Congratulations, " + firstName + " " + lastName + "! Your account has been successfully created. Welcome!");
			
			} else if (charTrue == 0) {
				System.out.println("Your password should contain at least 1 special character (@ # $ % &). Please enter a new one.");
				charStatus = false;
				numberStatus = false; 
				charTrue = 0;
				numberTrue = 0;
				password = scan.nextLine();

			} else if (numberTrue == 0) {
				System.out.println("Your password should contain at least 1 number. Please enter a new one.");
				charStatus = false;
				numberStatus = false;
				charTrue = 0;
				numberTrue = 0;
				password = scan.nextLine();
			}
		}

		System.out.println("Please choose the command you want to perform: " + "\n" + 
			"1. View Profile" + "\n" +
			"2. View Account Information " + "\n" + 
			"3. Logout" +"\n");

		while (true) {
			
			String query = scan.nextLine();
			Integer queryInt = Integer.parseInt(query);

			if (query.equalsIgnoreCase("View Profile") || queryInt == 1) {
				System.out.println("Profile" + "\n" + "First name: " + firstName + "\n" + "Last name: " + lastName + "\n" + "Age: " + age + "\n");
			}
		
			else if (query.equalsIgnoreCase("View Account Information") || queryInt == 2) {
				System.out.println("Account Information \nAccount number: " + accountNb + "\nPassword: ***********\n"); // Need to change **** 
			}
	
			else if (query.equalsIgnoreCase("Logout") || queryInt == 3) {
				System.out.print("Logging you out");
				for (int counter3 = 0; counter3 <3; counter3++) { 
				try{Thread.sleep(1000);}
					catch(InterruptedException e)
					{System.out.println(e);}    
				System.out.print(".");
				}
				System.out.println("\nSuccessfully logged out.");
				break;
			} 
			
			else {
				System.out.println ("Please enter a valid command.");
			}
		} 
		scan.close();
	}
}