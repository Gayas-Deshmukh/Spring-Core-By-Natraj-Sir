package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nt.cfgn.AppConfig;
import com.nt.sbeans.Flipkart;

public class Test 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Flipkart	fpkt		= ctx.getBean("fpkt", Flipkart.class);
    	String 		resultMsg	= fpkt.shopping(new String [] {"Shirt", "Bag"}, new Double [] {20.5, 30.96});

    	System.out.println(resultMsg);
    	
    	/**
    	 * OutPut - 
    	 * 
    	 * With @Qualifier("bDart")
    	 * [Shirt, Bag] items with billamount ::51.46 Oid : 535050598 order items are kept for delivery by BlueDart
    	 */
    }
    
}
