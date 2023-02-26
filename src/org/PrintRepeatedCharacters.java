package org;

import java.util.HashMap;
import java.util.Map;

public class PrintRepeatedCharacters 
{
	public static void main(String[] args) 
	{
		HashMap<Character, Integer> aMap = new HashMap<Character, Integer>();
		
		String str = "Occurrence";
		
		char []ch = str.toCharArray();
		
		for(char c : ch)
		{
			if(aMap.containsKey(c))
			{
				aMap.put(c, aMap.get(c)+1);
			}
			else
			{
				aMap.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : aMap.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		for(Map.Entry<Character, Integer> en:aMap.entrySet())
		{
			if(en.getValue()>1)
			{
				System.out.println(en.getKey());
			}
		}
	}
}
