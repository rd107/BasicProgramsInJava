package org;

public class RotateArray 
{
	public static void rotate(int []arr,int d,int n)
	{
		int []temp = new int[n];
		
		int k=0;
		
		for(int i=d;i<n;i++)
		{	
			temp[k] = arr[i];
			k++;
		}
		
		for(int i=0;i<d;i++)
		{
			temp[k] = arr[i];
			k++;
		}
		
		for(int i=0;i<n;i++)
		{
			arr[i] = temp[i];
		}
	}
	
	public static void printTheArray(int []arr,int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) 
	{
		int []arr = {1,2,3,4,5};
		
		int n = arr.length;
		
		int d = 3;
		
		rotate(arr,d,n);
		printTheArray(arr,n);
	}
}
