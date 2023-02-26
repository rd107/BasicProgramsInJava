package org;

import java.time.LocalTime;

public class TimerExample 
{
	public static void main(String[] args) 
	{
		LocalTime lt = LocalTime.now();
		
		int h = lt.getHour();
		int m = lt.getMinute();
		int s = lt.getSecond();
		
		h--;
		m--;
		s--;
		
		System.out.println(h+""+m+""+s);
		
		
	}
}
