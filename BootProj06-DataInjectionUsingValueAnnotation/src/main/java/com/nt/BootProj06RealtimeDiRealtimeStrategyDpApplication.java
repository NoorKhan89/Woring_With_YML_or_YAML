package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.beans.HotelInfo;

@SpringBootApplication
public class BootProj06RealtimeDiRealtimeStrategyDpApplication {


	public static void main(String[] args) 
	{
		
		// get IOC Container 
	ApplicationContext ctx=SpringApplication.run(BootProj06RealtimeDiRealtimeStrategyDpApplication.class, args);
	//get main spring bean class obj
	HotelInfo info = ctx.getBean("hotel",HotelInfo.class);
	System.out.println("Error what is so");
	System.out.println( "----------------"+info);
	System.out.println("Bill Amount after discount ::"+info.calCulateDiscount(200.0f));
	
	}

}
