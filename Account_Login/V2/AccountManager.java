package Account_Login.V2;

// To do list: REGEX
// create  a class for password
// create a class for account + array
// Insert try catchers

import java.util.Scanner;
public class AccountManager {
	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);

		String name, firstName, lastName, password, passwordVerf;
		String charList = "@#$%&";
		String numList = "0123456789";

		int age, accountNb;
		int charTrue = -1;
		int numTrue = -1;
		int charTracker = 0;
		int numTracker = 0;

		System.out.println("Hello, User. Let's start by creating an account." + "\n" + "Please enter your first name: ");
		firstName = scan.nextLine();

		System.out.println("Enter your last name:");
		lastName = scan.nextLine();

		name = (firstName.concat(" ")).concat(lastName);

		System.out.println("Welcome, " + name + ". Please enter your age: ");
		age = scan.nextInt();
		scan.nextLine();

		accountNb = ((int) (Math.random() * 90000001) + 10000000);
		System.out.println("This account number was generated for you: " + accountNb);

		System.out.println("Please enter a secure password of 12 characters minimum including at least 1 number and 1 special character (@ # $ % &): ");
		password = scan.nextLine();
		while (password.length() < 12) { 
				System.out.println("Your password is too short. Please enter a new one.");
				password = scan.nextLine();
		}	

		while (charTracker == 0 || numTracker == 0) {
			for (int counter1 = 0; counter1 < charList.length(); counter1++) {
			charTrue = password.indexOf(charList.charAt(counter1)); // value of charTrue is being overwritten
				if (charTrue != -1) { // Solution: a tracker that checks if the value of charTrue has been != -1
					charTracker += 1; // Whenever a char / number is the same repeated it is counted as 1 only
				} 
			}

			if (charTracker == 0) {
				System.out.println("Your password must contain at least 1 character (@#$%&). Please enter a new one.\n");
				charTracker = 0;
				numTracker = 0;
				password = scan.nextLine();
			}

			for (int counter2 = 0; counter2 < numList.length(); counter2++) {
			numTrue = password.indexOf(numList.charAt(counter2));
				if (numTrue != -1) {
					numTracker += 1;
				}
			}

			if (numTracker == 0) {
				System.out.println("Your password must contain at least 1 number. Please enter a new one.\n");
				charTracker = 0;
				numTracker = 0;
				password = scan.nextLine();
			}
		}
			
		System.out.println("Enter the password again: ");
		passwordVerf = scan.nextLine();

		while (password.equals(passwordVerf) == false) {				
			System.out.println("The password you enter does not match. Please enter it again.");
			passwordVerf = scan.nextLine();
		}

		//Accounts account1 = new Accounts(firstName, lastName, age, accountNb, password);		

		System.out.println("Congratulations, " + name + "! Your account has been successfully created. Welcome!");

		System.out.println("Please choose the command you want to perform: " + "\n" + 
			"1. View Profile" + "\n" +
			"2. View Account Information " + "\n" + 
			"3. Logout" +"\n");

		while (true) {
			
			String query = scan.nextLine();
			Integer queryInt = Integer.parseInt(query);

			if (query.equalsIgnoreCase("view profile") || queryInt == 1) {
				System.out.println("Profile" + "\n" + "First name: " + firstName + "\n" + "Last name: " + lastName + "\n" + "Age: " + age + "\n");
			}
		
			else if (query.equalsIgnoreCase("view account information") || queryInt == 2) {
				System.out.println("Account Information \nAccount number: " + accountNb + "\n*Change Password\n"); 
					query = scan.nextLine();
					queryInt = Integer.parseInt(query);
					if (query.equalsIgnoreCase("change password") || queryInt == 1) {
						System.out.println("Enter the old password:\n");
						passwordVerf = scan.nextLine();
						
						while (passwordVerf.equals(password) == false) {
							System.out.println("The password you enter does not match. Please enter it again.\n");
							passwordVerf = scan.nextLine();
						}
						
						System.out.println("Enter the new password:\n");
						password = scan.nextLine();
						System.out.println("Password changed successfully.\n");
					}
			}
	
			else if (query.equalsIgnoreCase("logout") || queryInt == 3) {
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