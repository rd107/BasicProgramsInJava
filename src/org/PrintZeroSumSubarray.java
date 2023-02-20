package org;

public class PrintZeroSumSubarray 
{
	public static void printAllSubarrays(int []narr)
	{
		for(int i=0;i<narr.length;i++)
		{
			int sum=0;
			
			for(int j=i;j<narr.length;j++)
			{
				sum = sum + narr[j];
				
				if(sum==0)
				{
					System.out.println(i+""+j);
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int []narr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
		
		printAllSubarrays(narr);
	}

}
