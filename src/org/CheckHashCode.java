package org;

public class CheckHashCode 
{
	public static void main(String[] args) 
	{
		CheckHashCode cc = new CheckHashCode();
		
		String st = new String("Hi");
		
		System.out.println(st.hashCode());
		
		System.out.println(cc.hashCode());
	}
}
