package corejavaprograms;

import java.util.Scanner;

public class Quotient_RemainderUC {

	public static void main(String[] args) {
		System.out.println("Enter the Dividend");
		Scanner Number1 = new Scanner(System.in);
		int dividend = Number1.nextInt();
		System.out.println("Enter the Divisor");
		Scanner Number2 = new Scanner(System.in);
		int divisor = Number2.nextInt();
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		System.out.println("Quo :" +quotient);
		System.out.println("Remainder :" +remainder);
	}

}
