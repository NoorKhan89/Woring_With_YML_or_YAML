package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle
{
	
		//HAS -A  property for fieldInjection
	@Autowired
	// @Qualifier("${choose.engine}") --place holder  ${<key>}  must be use only @Value(...) Annotaion
	// @Qualifier(@Value("${choose.engine}")-- @Value can not be use inside the @Qualifer Annotation
	
	/*@Value("${choose.engine}")
	private String bid;
	 // @Qualifier(bid) -- we can not pass variable inside the Annotation
	  */
	@Qualifier("engg")
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
