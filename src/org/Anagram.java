package org;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		String str1 = userInput.nextLine();
		String str2 = userInput.nextLine();
		
		String s1 = str1.toLowerCase();
		String s2 = str2.toLowerCase();
		
		char []c1 = s1.toCharArray();
		char []c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		boolean result = Arrays.equals(c1, c2);
		
		if(result)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
		
		userInput.close();
	}

}
