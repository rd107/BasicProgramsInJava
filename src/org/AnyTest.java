package org;

public class AnyTest 
{
	public static void binarySearch(int arr[],int first,int last,int key)
	{
		int mid = (first+last)/2;
		
		while(first<=last)
		{
			if(arr[mid]<key)
			{
				first = mid+1;
			}
			else if(arr[mid]==key)
			{
				System.out.println("Element found at: "+(mid+1)+".");
				break;
			}
			else
			{
				last = mid-1;
			}
			
			mid = (first+last)/2;
		}
		
		if(first>last)
			System.out.println("Element not found.");
	}
	
	public static void main(String[] args) 
	{
		int arr[] = {10,20,30,40};
		int first = 0;
		int last = arr.length-1;
		int key = 50;
		
		binarySearch(arr,first,last,key);
	}
}
