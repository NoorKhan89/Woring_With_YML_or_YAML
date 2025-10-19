package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle
{
	
		//HAS -A  property for fieldInjection
	@Autowired
	@Qualifier("vEngine")
	private IEngine engine;
	
	public Vehicle()
	{
		System.out.println("Vehicle ::0-param Contructore");
	}
	
	public void journey(String startPlace,String endPlace)
	{
		System.out.println("Vehicle.Journey()");
		//start the engine to start the journey
		engine.start();
		System.out.println(" Journey started from ::"+startPlace);
		System.out.println("Vehicle Journey() journey is going  on...... ");
		
		engine.stop();
		System.out.println(" Journey endded at ::"+endPlace);
		
	}
}
