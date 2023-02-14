package org;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		boolean flag = false;
		
		int num = userInput.nextInt();
		
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
				flag = true;
		}
		
		if(flag == true)
			System.out.println("Not Prime");
		else
			System.out.println("Prime");
		
		userInput.close();
	}

}
