package com.gmail.lynx7478.counter;

public class Main {

	public static void main(String[] args) 
	{
		int num = 0;
		while(true)
		{
			num++;
			System.out.println(num);
			try
			{
				Thread.sleep(1000L);
			}catch(InterruptedException e)
			{
				System.out.println("What? It got interrupted?");
				e.printStackTrace();
			}
		}
	}

}
