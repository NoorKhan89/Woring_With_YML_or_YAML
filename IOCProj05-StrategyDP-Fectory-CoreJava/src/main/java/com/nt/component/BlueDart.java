package com.nt.component;

public final class BlueDart implements Courier {
	
	public BlueDart() 
	{
		System.out.println("BlueDart : 0 - Param Constructore");
	}
	
	@Override
	public String deliver(int old) 
	{
		return "Order Id"+old+"Oder is set delivery using BLueDart Couiress Service";
	}

}
