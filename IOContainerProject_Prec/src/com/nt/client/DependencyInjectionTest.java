package com.nt.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DependencyInjectionTest {

	public static void main(String[] args)
	{

		FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/nt/cfgs/application.xml");
		Object obj=ctx.getBean("wmg");
		
	}

}
