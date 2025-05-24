package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bDart")
public class BlueDart implements Courier
{
	@Override
	public String deliver(int oid) 
	{
		return "Oid : " + oid + " order items are kept for delivery by BlueDart";
	}
}
