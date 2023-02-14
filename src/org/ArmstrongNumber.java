package org;

import java.util.Scanner;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		int num = userInput.nextInt();
		
		int temp = num;
		
		int rem = 0, sum = 0;
		
		while(temp>0)
		{
			rem = temp%10;
			sum = sum + (rem*rem*rem);
			temp=temp/10;
		}
		
		if(sum==num)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
		
		userInput.close();
	}

}
