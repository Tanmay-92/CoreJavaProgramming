package corejavaprograms;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		System.out.println("Enter the 1st number:");
		Scanner Number1 = new Scanner(System.in);
		System.out.println("Enter the 2nd number:");
		Scanner Number2 = new Scanner(System.in);
		System.out.println("Enter the 3rd number :");
		Scanner Number3 = new Scanner(System.in);
		int N1=Number1.nextInt();
		int N2=Number2.nextInt();
		int N3=Number3.nextInt();
		if(N1>N2) {
			if(N1>N3) {
				System.out.println("Number 1st is Greater :"+N1);
			}
			else {
				if(N2>N3) {
					System.out.println("Number 2nd is Greater :"+N2);
				}
			}
		}
		if (N3>N1) {
			if(N3>N2) {
				System.out.println("Number 3rd is Greater :"+N3);
			}
		}
		else {
			System.out.println("Something went wrong");
		}
	}

}
