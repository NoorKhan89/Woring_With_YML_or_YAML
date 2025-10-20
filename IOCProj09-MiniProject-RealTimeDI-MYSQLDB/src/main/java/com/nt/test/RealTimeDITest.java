//RealTimeDITest.java
package com.nt.test;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.controller.CustomerOperationConstroller;
import com.nt.model.Customer;

public class RealTimeDITest 
{
	public static void main(String[] args) 
	{
		//read input values from enduser
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Customer name ::");
		String name=sc.next();
		System.out.println("Enter Customer Address ::");
		String adds=sc.next();
		System.out.print("Enter Customer Bill Amount ::");
		Double billAmt =sc.nextDouble();
		System.out.println("Enter Discount Persentage  ::");
		double discount=sc.nextDouble();
		//Create Customer Class Object
		Customer cust = new Customer();
		cust.setCname(name);
		cust.setCaddrs(adds);
		cust.setBillAmount(billAmt);
		cust.setDiscount(billAmt);
		cust.setFinalAmount(billAmt);
		//Create IOC Cantainer
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Controller class Obbject from the IOC Container
		CustomerOperationConstroller controller =ctx.getBean("customer",CustomerOperationConstroller.class);
		// invoke the b.methode
		try 
		{
		String resultMsg=controller.processCustomer(cust);
		System.out.println(resultMsg);
		}
		catch ( SQLException se)
		{
			if (se.getErrorCode()==12899)
			System.out.println("Problem with columme size");
			else {
				System.out.println("One or Anather DB Problem");
			}
		}
		catch (Exception e)
		{
			System.out.println("Non DB Problem");
		}
		System.out.println(System.getProperties());
		//closed the IOC Container
		ctx.close();	
	}  //main
}   //class
