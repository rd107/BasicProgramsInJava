package org;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		int fact = 1;
		
		int n = userInput.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			fact = fact*i;
		}
		
		System.out.println(fact);
		
		userInput.close();
	}

}
