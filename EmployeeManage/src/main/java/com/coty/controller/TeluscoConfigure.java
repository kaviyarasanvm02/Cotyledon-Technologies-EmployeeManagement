package com.coty.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.coty")
public class TeluscoConfigure 
{

	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver iv =new InternalResourceViewResolver();
		iv.setPrefix("/WEB-INF/view/");
		iv.setSuffix(".jsp");
		
		return iv ;
		
	}
	
}
