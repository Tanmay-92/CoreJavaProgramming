package corejavaprograms;

import java.util.Scanner;

public class Power_2 {

	public static void main(String[] args) {
		int Base =2 ;
		System.out.println("Enter the power for 2 :");
		Scanner Power_Number = new Scanner(System.in);
		int N=Power_Number.nextInt();
		int Result =1;
		if(N>0 && N<31) {
			
			while(N>0 && N<31) 
			{
			  Result = Result*Base;
			  N--;
			}
		
			
			System.out.println(" the answer is :" +Result);	
		}
		else {
			System.out.println("Enter the Valid Number");
		}
		
		

	}

}
