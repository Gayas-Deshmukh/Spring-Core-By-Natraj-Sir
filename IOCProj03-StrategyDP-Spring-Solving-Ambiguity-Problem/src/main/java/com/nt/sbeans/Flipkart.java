package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class Flipkart 
{
	@Autowired
	@Qualifier("shipment") // "shipment" is alias defined in config xml file
	private Courier courier;
	
	public String shopping(String [] items, Double [] prices)
	{
		//Calculate Bill amount
		double billAmount = 0.0d;
		
		for (double price : prices)
		{
			billAmount+= price;
		}
		
		//Generate Order Id
		int oid	=	new Random().nextInt();
		
		String msg = courier.deliver(oid);
		
		return Arrays.toString(items) + " items with billamount ::" + billAmount + " " + msg;
	}
}
