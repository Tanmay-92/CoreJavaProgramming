package corejavaprograms;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		System.out.println("enter the 1st number :");
		Scanner Number1 = new Scanner(System.in);
		int A=Number1.nextInt();
		System.out.println("enter the 2nd number :");
		Scanner Number2 = new Scanner(System.in);
		int B=Number2.nextInt();
		int C=0;
		System.out.println("before swapping A ="+A);
		System.out.println("before swapping B ="+B);
		C=A;
		A=B;
		B=C;
		System.out.println("After swapping value of A= :" +A);
		System.out.println("After swapping value of B= :" +B);
	}

}
