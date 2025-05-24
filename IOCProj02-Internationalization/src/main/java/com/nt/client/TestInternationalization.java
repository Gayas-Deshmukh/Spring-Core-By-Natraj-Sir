package com.nt.client;

import java.util.Locale;
import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nt.config.AppConfig;


public class TestInternationalization 
{

	public static void main(String[] args) 
	{
		// Create IOC container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// Read Language Code & Country Code from EndUser
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Language Code :");
		String lang = scan.next();
		
		System.out.println("Enter Country Code :");
		String country = scan.next();
		
		// Prepare local object having language code + country code
		 Locale locale = new Locale(lang, country);
		 
		// 
		 String welcomeMsg 	= context.getMessage("welcome.msg", new Object[0], locale);
		 String googByMsg 	= context.getMessage("goodby.msg", new Object[0], locale);
		 String appTitile 	= context.getMessage("application.title", new Object[0], locale);
		 String wishMsg		= context.getMessage("wish.message", new Object[0], locale);
		 
		 System.out.println(welcomeMsg);
		 System.out.println(googByMsg);
		 System.out.println(appTitile);
		 System.out.println(wishMsg);
		 
		 // close the container
		 context.close();
		/** 
		 * OutPut 1
		 
		 Enter Language Code :
		 fr
		 Enter Country Code :
		 FR
		 
		 Bonjour
		 À bientôt
		 Flipkart.com
		 Bonne année 2024
		 ***************************************
		 Output 2
		 
		 Enter Language Code :
		 hi
		 Enter Country Code :
		 IN
		 
		 शुभ प्रभात
		 जल्द ही फिर मिलेंगे
		 Flipkart.com
		 नया साल मुबारक हो 2024
		 ***************************************
		 Output 3 (Wrong lang code & country code will give you default base properties file key values)
		 
		 Enter Language Code :
		 df
		 Enter Country Code :
		 TH
		 
		 Good Morning
		 See you soon
		 Flipkart.com
		 Happy New 2024 
		 
       **/
	}

}
