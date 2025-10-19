package com.nt.client;

import com.nt.component.Flipkart;

public class StrategyDP_FactoryDPTest
{
	public static void main(String args[])
	{
		//use Factory pattern to get Flipkart class to get Object having our choice dependent class obj
		Flipkart fpkt = Flipkart.getinstance("DTDC");
		//invoked the B.methode
		String resultMsg =fpkt.shopping(new String[] {"Kurtha-pejama","Pathani","Arthar","sweets"},
				new double[]{2000.0,3000.0,1000.0,6000.0});
		System.out.println(resultMsg);
		
	}

}
