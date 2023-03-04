package org;

public class StringPalindrome 
{
	public static void main(String[] args) 
	{
		String str = "Nitin";
		String reverse = "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse = reverse + str.charAt(i);
		}
		
		if(reverse.equalsIgnoreCase(str))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
