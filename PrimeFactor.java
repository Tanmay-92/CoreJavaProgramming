package corejavaprograms;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		Scanner Number = new Scanner(System.in);
		int N;
		int i;
		int j;
		int k=0;
		int sum=0;
		System.out.println("Enter the no of terms :");
		N=Number.nextInt();
		for(i=2 ; i<=N ; i++) {
			if(N%i==0) {
				for(j=2 ; j<=i ; j++) {
					if(i%j==0) {
						k++;
						
					}
					if(k==1) {
						sum=sum+i;
					}
				}
				
			}
			k=0;
		}
		System.out.println("Original number :"+N);
		System.out.println("Sum of Prime Factors :"+sum);
	}

}
