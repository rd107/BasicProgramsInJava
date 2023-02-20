package org;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubarray 
{
	public static boolean checkSubarray(int []sarray)
	{
		Set<Integer> aSet = new HashSet<Integer>();
		
		int sum = 0;
		
		aSet.add(0);
		
		for(int n : sarray)
		{
			sum += n;
			
			if(aSet.contains(sum))
			{
				return true;
			}
			
			aSet.add(sum);
		}
		
		return false;
	}
	
	public static void main(String[] args) 
	{
		int []arr = {4,-6,3,-1,4,2,7};
		
		if(checkSubarray(arr))
		{
			System.out.println("Sum of subarray is zero");
		}
		else
		{
			System.out.println("Sum of subarray is not zero");
		}
		
	}
}
