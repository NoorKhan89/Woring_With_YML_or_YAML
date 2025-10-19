package com.nt.fectory;

import com.nt.component.BlueDart;
import com.nt.component.Courier;
import com.nt.component.DHL;
import com.nt.component.DTDC;
import com.nt.component.Flipkart;

public abstract class FlipkartFactory
{

	// static fatory method having to logic to create flipkart obj having  the given couriier object
	public Flipkart getinstance (String courirType, BlueDart BlueDart) throws IllegalAccessException
	{
	
		Courier courir=null;
		//create dependence class object 
		
		if (courirType.equalsIgnoreCase("DTDC"))
			courir = new DTDC();
		
		else if (courirType.equalsIgnoreCase("b.Dart")) 
			courir = new BlueDart();
		else if (courirType.equalsIgnoreCase("DHL"))
			courir= new DHL();
		
		else 
			throw new IllegalAccessException("Invalides Courier Types");
			
	//Create target class obj
		Flipkart fpkt = new Flipkart();
		// assign dependent to target class 
		fpkt.setCouries(courir);
		return fpkt;
		
	}


	
}
