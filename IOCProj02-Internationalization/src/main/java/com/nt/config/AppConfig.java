package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig 
{
	@Bean("messageSource") // messageSource is the fixed bean id
    public ResourceBundleMessageSource createRBMS()
    {
    	ResourceBundleMessageSource source = new ResourceBundleMessageSource();
    	source.addBasenames("com/nt/commons/App");
    	return source;
    }
}
