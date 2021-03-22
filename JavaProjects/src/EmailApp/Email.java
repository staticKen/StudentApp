package EmailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "NIoncompany.com";

	// constructor to receive the first and last name;
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("EMAIL CREATED: " + " " + this.firstName + "." + this.lastName);

		// call a method asking for the the department- return department

		this.department = setDepartment();
		//System.out.println("DEPARTMENT: " + this.department);
		
		// call a method that returns a random password
		//set password and parameterize. print
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
//		combine elements to generate email
		//documentation said use lowercase
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		//System.out.println("Your email is: " + email);
	}

	// Ask for the department
	private String setDepartment() {
		System.out.print("New Assosiate:" + firstName + "\nDEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {return "sales";}
		else if (depChoice == 2) {return "dev";}
		else if(depChoice == 3) { return "acct";}
		else {return "";}
	}
	// Generate a random password
	// find the value of an array at any given number
	// iterate through the value of length
	private String randomPassword(int length) {
		 String randomSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@$&#";
		 char[] password = new char[length];
		 for(int i=0; i<length; i++) {
		 int rand = (int) (Math.random()* randomSet.length());
		
		password[i] = randomSet.charAt(rand);
	}
	//modify to new String, pass char password
	return new String(password);
}

// set mailbox capacity: mailbox defined ^^ 
	//hide the properties               
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	public int getmailboxCapacity() {
		return mailboxCapacity;
		}


// set the alternate email:emailed defined^^
	//good for pratice
	//setEmail
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}//getEmail
	public String getAlternateEmail() {
		return alternateEmail;
	}


// change (set)password
	public void setpassword(String password) {
		this.password = password;
	}//get password
	public String getPassword() {
		return password;
			
	}
	
	public String showInfo() {
		return "\nDisplay NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOXCAPACITY:" + mailboxCapacity +"mb";
	}
	
	
	// Final step: Erase some redundancies^^
	// we Don't need to see email created;Use showInfo method
	
	
	
	
	
	
	
	
	
	
	
}