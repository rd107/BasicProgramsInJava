package org;

public class ReverseWords 
{
	public static void main(String[] args) 
	{
		String str = "my name is rahul";
		
		String []words = str.split("//s");
		
		String reverse = "";
		
		int length = words.length;
		
		for(int i=0;i<length;i++)
		{
			String word = words[i];
			String reverseWord = "";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseWord = reverseWord + word.charAt(j);
			}
			
			reverse = reverse + reverseWord;
		}
		
		System.out.println(reverse);
	}
}
