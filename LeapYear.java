package corejavaprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the Year :");
		Scanner LeapYear = new Scanner(System.in);
		int Year = LeapYear.nextInt();
		if(Year>=999 && Year<=9999) {
		if (Year % 4 == 0) {
			if (Year % 100 == 0) {
				if (Year % 400 == 0) {
					System.out.println("Hurray IT'S A Leap Year");
				} else {
					System.out.println("NOT A LEAP YEAR");
				}
			} else {
				System.out.println("ITS A LEAP YEAR");
			}
		} else {
			System.out.println("NOT A LEAP YEAR");
		}
		}
		else {
			System.out.println("Run the code Again And Enter The 4 Digit Number Only");
		}
		LeapYear.close();
	}

}
