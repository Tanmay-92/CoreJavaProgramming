package corejavaprograms;

import java.util.Scanner;

public class VowelAndConsonent {

	public static void main(String[] args) {
		
	    char ch;
		System.out.println("Enter any alphabet:");
		Scanner Alphabets = new Scanner(System.in);
		ch = Alphabets.next().charAt(0);
		if(ch == 'a' || ch =='e' || ch =='i' || ch =='o' || ch =='u') 
		{
			System.out.println("Vowel");
			
		}
			
		else System.out.println("Consonant");
		Alphabets.close();
	}

}
//CTRL+/
