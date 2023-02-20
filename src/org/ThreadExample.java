package org;

public class ThreadExample extends Thread
{
	int x = 2;
	int y = 3;
	
	public void run()
	{
		System.out.println("Thread started"+Thread.currentThread().getId());
		
		System.out.println(x*2);
		System.out.println(y*3);
	}
	
	
	public static void main(String[] args) 
	{
		ThreadExample th = new ThreadExample();
		ThreadExample th1 = new ThreadExample();
		
		th.start();
		th1.start();
	}

}
