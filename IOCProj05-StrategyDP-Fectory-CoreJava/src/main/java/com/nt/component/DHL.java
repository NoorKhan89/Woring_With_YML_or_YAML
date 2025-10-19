package com.nt.component;

public final class DHL implements Courier {
	
	public DHL() 
	{
		System.out.println("DHL : 0- Param Constructore");
	}
	
	@Override
	public String deliver(int old) 
	{
		return "Order Id"+old+"Oder is set delivery using DHL Couiress Service";
	}

}
