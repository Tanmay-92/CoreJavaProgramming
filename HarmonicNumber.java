package corejavaprograms;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner Number = new Scanner(System.in);
		System.out.println("Enter the value of N :");
		int N=Number.nextInt();
		float sum =0.0F;
		for(int i=1 ; i <=N ; i++) {
			
			sum=sum+(float)1/i ;
		}
		System.out.println("The sum:" +sum);

	}

}
