package org;

import java.util.Arrays;

public class AnagramManual 
{
	public static void main(String[] args) 
	{
		String str = "cetpa";
		String str1 = "aptec";
		
		char c1[] = str.toCharArray();
		char c2[] = str1.toCharArray();
		
		char temp;
		char temp1;
		
		for(int i=0;i<c1.length;i++)
		{
			for(int j=1;j<c1.length-i;j++)
			{
				if(c1[j-1]>c1[j])
				{
					temp = c1[j-1];
					c1[j-1] = c1[j];
					c1[j] = temp;
				}
			}
		}
		
		for(int i=0;i<c2.length;i++)
		{
			for(int j=1;j<c2.length-i;j++)
			{
				if(c2[j-1]>c2[j])
				{
					temp1 = c2[j-1];
					c2[j-1] = c2[j];
					c2[j] = temp1;
				}
			}
		}
		
		
		boolean result = Arrays.equals(c1, c2);
		
		if(result)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
		
	}

}
