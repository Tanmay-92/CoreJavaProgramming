package corejavaprograms;

import java.util.Scanner;

public class HeadAndTail_UC {

	public static void main(String[] args) {
		double time ;
		int i ;
		double Head = 0;
		double Tail = 0;
		double Head_Percent;
		double Tail_Percent;
		System.out.println("Enter the No.of times to flip the coin :");
		Scanner Flip = new Scanner(System.in);
		time= Flip.nextInt();
		for(i=0 ; i<time ; i++)
		{
			double A=Math.floor(Math.random() * 10) %2 ;
			if( A<0.5 ) 
			{
			 	Tail++ ;
			}
			else {
				Head++;
			}
			System.out.println("head :" +Head);
			System.out.println("tail :" +Tail);
			Head_Percent=(Head*100)/time;
			Tail_Percent=(Tail*100)/time;
			System.out.println("Percentage of Head :"+Head_Percent);
			System.out.println("Percentage of Tail :"+Tail_Percent);
			
		}
		
	

	}

}
