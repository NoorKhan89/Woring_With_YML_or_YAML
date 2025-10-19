package com.nt.component;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Flipkart 
{
	//HAS A Property
private Courier courier;

public Flipkart()
{
	System.out.println(" Flipkart  --  0::Param Constructore");
}

//setter methode for injection { assigning dependencnt class obj to target class obj}

public void setCouries (Courier courier)
{
	System.out.println("FlipCart.setCourirer");
	this.courier=courier;
}

//b.mathode
public String shopping (String items[],double price[])
{
	// calculated Bill Amount
	double total=0.0;
	double[] prices = null;
	for(double p: prices)
	{
		total =total+p;
	}

	
	//gernate randome number as the oder id
	int  old = new Random().nextInt(1000);
	
	
	//use  courier 
	String msg= courier.deliver(old);
	return Arrays.toString(items)+"Are purchesed having price "+Arrays.toString(prices)+"With bill amt :"+total+"-->msg";	
	
	
}

public static Flipkart getinstance(String string) {
	// TODO Auto-generated method stub
	return null;
}

}



























