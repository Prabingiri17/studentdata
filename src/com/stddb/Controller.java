package com.stddb;

import java.util.Scanner;

public class Controller {
	public static void main(String[] args) {
		// number of students to be admitted

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of students to be enrolled:\t");
		int no = sc.nextInt();
		Studentdb[] std = new Studentdb[no];
		System.out.println(std.length);
		
		for (int i = 0; i < no; i++) {

			std[i] = new Studentdb();

		}
		
		for (int i = 0; i < no; i++) {
			System.out.println(std[i].toString());

			
		}

	}

}
