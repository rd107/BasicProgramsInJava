package org;

public class AnagramManual 
{
	public static boolean checkAnagram(char []carr1,char []carr2)
	{
		char temp1;
		char temp2;
		
		int len1 = carr1.length;
		int len2 = carr2.length;
		
		for(int i=0;i<len1;i++)
		{
			for(int j=1;j<len1-i;j++)
			{
				if(carr1[j-1]>carr1[j])
				{
					temp1 = carr1[j-1];
					carr1[j-1]=carr1[j];
					carr1[j]=temp1;
				}
			}
		}
		
		for(int i=0;i<len2;i++)
		{
			for(int j=1;j<len2-i;j++)
			{
				if(carr2[j-1]>carr2[j])
				{
					temp2=carr2[j-1];
					carr2[j-1]=carr2[j];
					carr2[j]=temp2;
				}
			}
		}
		
		for(int i=0;i<len1;i++)
		{
			if(carr1[i]!=carr2[i])
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) 
	{
		String str = "cetpa";
		String str1 = "aptec";
		
		char []c1 = str.toLowerCase().toCharArray();
		char []c2 = str1.toLowerCase().toCharArray();
		
		if(checkAnagram(c1, c2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}

}
