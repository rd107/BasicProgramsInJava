package org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicate 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(0);
		al.add(2);
		al.add(2);
		al.add(1);
		al.add(5);
		
		System.out.println(al);
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>(al);
		
		Iterator<Integer> itr = lhs.iterator();
		
		while(itr.hasNext())
		{
			Integer i = itr.next();
			System.out.println(i);
		}
		
	}
}
