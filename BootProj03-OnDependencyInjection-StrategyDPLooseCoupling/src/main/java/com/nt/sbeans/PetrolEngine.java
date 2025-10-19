package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("pEngine")
@Lazy
public class PetrolEngine implements IEngine

{

	public PetrolEngine()
	{
		System.out.println("PetrolEngine ::0-param Contructore ");	
	}

	@Override
	public void start()
	{
		System.out.println("PetrolEngine...start() :: PetrolEngine is start ");
		
	}

	@Override
	public void stop() 
	{
		System.out.println("PetrolEngine...Stop() :: PetrolEngine is Stop ");
	}

}
