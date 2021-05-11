package com.usingConstructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig 
{
	@Bean(name = "s1")
	public Student s()
	{
		return new Student();
	}
}
