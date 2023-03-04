package org;

public class AnyTest 
{	
	public static void main(String[] args) 
	{
		String str = "my name is rahul";
		
		String []ms = str.split("//s");
		
		String reverseString = "";
		
		int length = ms.length;
		
		for(int i=0;i<length;i++)
		{
			String word = ms[i];
			
			String reverse = "";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				reverse = reverse + word.charAt(j);
			}
			
			reverseString = reverseString + reverse;
		}
		
		System.out.println(reverseString);
		
	}
}
