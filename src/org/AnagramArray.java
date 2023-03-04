package org;

import java.util.Arrays;

public class AnagramArray 
{
	public static char []sortedArray1(char []arr)
	{
		char ch[] = arr;
		
		int length = ch.length;
		
		char temp;
		
		for(int i=0;i<length;i++)
		{
			for(int j=1;j<length-i;j++)
			{
				if(ch[j-1]>ch[j])
				{
					temp=ch[j-1];
					ch[j-1]=ch[j];
					ch[j]=temp;
				}
			}
		}
		
		return ch;
	}
	
	public static char []sortedArray2(char []arr)
	{
		char ch[] = arr;
		
		int length = ch.length;
		
		char temp;
		
		for(int i=0;i<length;i++)
		{
			for(int j=1;j<length-i;j++)
			{
				if(ch[j-1]>ch[j])
				{
					temp=ch[j-1];
					ch[j-1]=ch[j];
					ch[j]=temp;
				}
			}
		}
		
		return ch;
	}
	
	public static void main(String[] args) 
	{
		String str1 = "cetpa";
		String str2 = "aptec";
		
		char []c1 = str1.toCharArray();
		char []c2 = str2.toCharArray();
		
		char []sortedcrr1 = sortedArray1(c1);
		char []sortedcrr2 = sortedArray2(c2);
		
		if(Arrays.equals(sortedcrr1, sortedcrr2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}

}
