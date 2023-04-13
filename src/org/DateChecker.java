package org;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateChecker 
{
	public static void main(String[] args) 
	{
		Date dat = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		String sdate = sdf.format(dat);
		
		System.out.println(sdate);
	}
}