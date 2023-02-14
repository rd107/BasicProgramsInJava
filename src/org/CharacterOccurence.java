package org;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurence 
{
	public static void main(String[] args) 
	{	
		String str = "Occurrence";
		
		HashMap<Character,Integer> aMap = new HashMap<Character,Integer>();
		
		char []c1 = str.toCharArray();
		
		for(char c:c1)
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
		
		for(Map.Entry entry : aMap.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
