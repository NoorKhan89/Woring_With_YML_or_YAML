package com.java.vayam;

import com.java.vayam.Person;

public class Person
{
	String name;
	int age;
	
	void talk()
	{
		System.out.println("Hello Bro how are you"+name);
		System.out.println("I'm ago are so "+age);
	}
	class Demo
	{
		public static void main(String args[])
		{
			Person Raju = new Person();
			System.out.println("HashCode =="+Raju.hashCode());
		}
	}
}
