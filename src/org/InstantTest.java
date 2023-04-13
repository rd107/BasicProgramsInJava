package org;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

public class InstantTest 
{
	public static void main(String[] args) 
	{
		Instant inst1 = Instant.now();
	
		Instant inst2 = Instant.now();
		
		Duration timeElapsed = Duration.between(inst1, inst2);
		
		long lg1 = 1681376178448l;
		long lg2 = 1681377067811l;
		
		long result = lg2-lg1;
		
		long sec = (result/1000)%60;
		long min = (result/(1000*60))%60;
		long hr = (result/(1000*60*60))%24;
		System.out.println(hr+":"+min+":"+sec);
	}
}
