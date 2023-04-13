package org;

public class AnyTest 
{	
	public static void binarySearch(int []arr,int first,int last,int key)
	{
		int mid = (first+last)/2;
		
		while(first<=last)
		{
			if(arr[mid]<key)
			{
				first = mid + 1;
			}
			else if(arr[mid]==key)
			{
				System.out.println("Found at mid: "+mid);
				break;
			}
			else
			{
				last = mid - 1;
			}
			
			mid = (first+last)/2;
		}
	}
	
	public static void main(String[] args) 
	{
		int []arr = {10,20,30,40,50};
		
		int n = arr.length-1;
		
		int key = 10;
		
		binarySearch(arr,0,n,key);
	}
}
