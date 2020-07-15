package com.stddb;

import java.util.Scanner;

public class Studentdb {

	private String firstName;
	private String lastName;
	private String studentID;
	private static int ID = 1001;
	private String courses=" ";
	private int balance;
	private static int courseCost = 600;
	private int studentYear;

	// Student first name, last name, year

	public Studentdb() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student's First Name: ");
		this.firstName = sc.nextLine();
		System.out.println("Enter Student's Last Name: ");
		this.lastName = sc.nextLine();
		System.out.println("Enter Student's Enrolling year: " + "\n" + "1 - First Year\n" + "2 - Second Year\n"
				+ "3 - Third Year\n" + "4 - Final Year\n ");
		this.studentYear = sc.nextInt();

		setstudentID();
		// System.out.println("Name: "+firstName+" "+lastName+"\n"+ "ID: "+studentID);

		courses();
		payment();

	}

	// 5 digit unique id with first number as grade level

	public String setstudentID() {
		ID++;
		this.studentID = studentYear + "" + ID;

		return studentID;

	}

	// enrolled courses

	public void courses() {
		System.out.println("Enter the course you want to enroll in ( Q to quit): ");
		do {
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
			if (!course.equalsIgnoreCase("Q")) {

				courses+= course+"\t";
				balance += courseCost;

			} else {
				break;
			}
		} while (true);
		System.out.println("Course Enrolled: " +courses);
		System.out.println("Balance :" + balance);

	}

	// view balance

	public void viewBalance() {
		System.out.println("Remaining Fees:$" + balance);
	}

	// cost of enrolled courses

	public void payment() {
		System.out.println("Enter an amount to pay: ");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		this.balance = balance - payment;
		System.out.println("Paid Amount: $" + payment);
		viewBalance();
	
	}

	// show info

	public String toString() {
		return "\n\n\n Name:" + firstName + " " + lastName + "\n System ID: " + studentID + "\n Enrolled Courses: " + courses
				+ "\n Remaining Fees:$" + balance;
	}

}
