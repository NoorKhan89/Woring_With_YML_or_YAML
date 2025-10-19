package com.nt.component;

public final class DTDC implements Courier {
	
	public DTDC() 
	{
		System.out.println("DTDC : 0- Param Constructore");
	}
	
	@Override
	public String deliver(int old) 
	{
		return "Order Id"+old+"Oder is set delivery using DTDC Couiress Service";
	}

}
