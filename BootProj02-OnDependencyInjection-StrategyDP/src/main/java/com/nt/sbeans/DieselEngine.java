package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("vEngine")
@Lazy
public final class DieselEngine implements IEngine
{
	public DieselEngine()
	{
		System.out.println("DieselEngine ::0-param Contructore ");	
	}


	@Override
	public void start()
	{
		System.out.println("DieselEngine...start() ::DeisuleEngine is start ");
		
	}

	@Override
	public void stop() 
	{
		System.out.println("DieselEngine...Stop() ::DeisuleEngine is Stop ");
	}

}
