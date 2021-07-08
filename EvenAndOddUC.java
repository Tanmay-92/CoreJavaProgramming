package corejavaprograms;

import java.util.Scanner;

public class EvenAndOddUC {

	public static void main(String[] args) {
		System.out.println("Enter A number to check even or odd :");
		Scanner Number = new Scanner(System.in);
		int N=Number.nextInt();
		if(N%2==0) 
		{
			System.out.println("its an Even Number :");
		}
		else {
			System.out.println("its a Odd Number :");
		}
	}

}
