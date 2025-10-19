package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("cEngine")
@Lazy

public class CNGEngine implements IEngine
{

	public CNGEngine()
	{
		System.out.println("CNGEngine ::0-param Contructore ");	
	}

	@Override
	public void start()
	{
		System.out.println("CNGEngine...start() :: CNGEngine is start ");
		
	}

	@Override
	public void stop() 
	{
		System.out.println("CNGEngine...Stop() :: CNGEngine is Stop ");
	}

}
