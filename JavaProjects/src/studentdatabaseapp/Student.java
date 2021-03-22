package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// Constructor: prompt the user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();

		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();

		System.out.println("1 - Freshmen\n2 - Sophoremore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();

		setStudentID();

		// System.out.println(firstName + " " + lastName + " " + gradeYear + " " +
		// studentID);

	}

	// Generate an ID
	// static means the value or property is not specific to an object but for all
	// objects
	// it belongs to the class not instance of the object ^^
	private void setStudentID() {
		// Grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;

	}

	// Enroll in courses

	public void enroll() {
		// get inside a loop user hits zero
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n " + course;
				tuitionBalance = tuitionBalance + costOfCourse;

			} else {
				break;
			}

		} while (1 != 0);
		// System.out.println("ENROLLED IN : " + courses);
		// System.out.println("TUITION BALANCE : " + tuitionBalance);

	}

// View balance
	public void viewbalance() {
		System.out.println("Your balance is : $" + tuitionBalance);
	}

// Pay tuition
	public void payTuition() {
		System.out.print("Enter your Payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewbalance();

	}

//final step
// Show status
	public String toString() {
		return "Name: " + firstName + " " + lastName + 
				"\nGrade level: " + studentID + 
				"\nCourses Enrolled:" + courses
				+ "\nBalance: $" + tuitionBalance;
	}

}