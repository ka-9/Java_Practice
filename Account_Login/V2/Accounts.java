package Account_Login.V2;

public class Accounts {
	private String firstName;
	private String lastName;
	private String password;
	private int age;	
	private int accountNb;

	public Accounts (String firstName, String lastName, int age, int accountNb, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.accountNb = accountNb;
		this.password = password;
	}	

	public void setFirstName (String firstNameValue) {
		firstName = firstNameValue;
	}
		
	public void setLastName (String lastNameValue) {
		lastName = lastNameValue;
	}
}