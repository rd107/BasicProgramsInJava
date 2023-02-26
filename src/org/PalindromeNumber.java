package org;

import java.util.Scanner;

public class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		int num = userInput.nextInt();
		
		int temp=0;
		
		temp = num;
		
		int rem = 0,sum = 0;
		
		while(temp>0)
		{
			rem = temp%10;
			sum = (sum*10) + rem;
			temp = temp/10;
		}
		
		if(sum==num)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not Palindrome Number");
		
		userInput.close();
	}

}
