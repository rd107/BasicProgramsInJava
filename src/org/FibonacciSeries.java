package org;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 1;
		
		int nterms = userInput.nextInt();
		
		System.out.print(n1+" "+n2+" ");
		
		for(int i=0;i<nterms-2;i++)
		{
			int n3 = n1 + n2;
			System.out.print(n3+" ");
			
			n1 = n2;
			n2 = n3;
		}
		
		userInput.close();
	}

}
