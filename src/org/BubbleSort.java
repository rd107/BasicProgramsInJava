package org;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int []arr = {50,10,40,30,20};
		
		int temp = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<(arr.length-i);j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int x : arr)
			System.out.println(x);
	}
}
