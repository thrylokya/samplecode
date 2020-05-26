package com.cromai.demo;
import java.util.Date;

public class BabyBirth {
	public static void main(String a[])
	{
		boolean attended=false;
		Date birthdate=new Date();
		
		while(new Date().getMonth() -  birthdate.getMonth() <3)
		{
			try {
				drinkMilk();

				Thread.sleep(1800000);
				play();
				
				Thread.sleep(1800000);
				
				sleep();
				
				Thread.sleep(3600000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				while(attended)
				{
					System.out.println("Cry");
					attended=true;
				}
			}
		}
	}

	private static void sleep() {
		// TODO Auto-generated method stub
		System.out.println("sleeping");
	}

	private static void play() {
		// TODO Auto-generated method stub
		System.out.println("palying");
	}

	private static void drinkMilk() {
		// TODO Auto-generated method stub
		System.out.println("dringking milk");
	}
}
