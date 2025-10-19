package com.nt;

import com.nt.sbeans.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootProj02OnDependencyInjectionStrategyDpApplication
{

    private final Vehicle vehicle;

    BootProj02OnDependencyInjectionStrategyDpApplication(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

	public static void main(String[] args) 
	{
		//IOC Container 
	try(ConfigurableApplicationContext ctx= 
			SpringApplication.run(BootProj02OnDependencyInjectionStrategyDpApplication.class,args);)
	{
		//get Target class object fro mthe IOC container
	Vehicle vehicle = ctx.getBean("vehicle",Vehicle.class);
	
	//invoke the B.methode
	vehicle.journey("hyd","dehli");
	
	}//try
	catch (Exception e) {
		e.printStackTrace();
	}
	
	}//main

}//class