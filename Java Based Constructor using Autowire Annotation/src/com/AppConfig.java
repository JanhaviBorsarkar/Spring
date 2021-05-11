package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig 
{
	@Bean(name = "s1")
	public Student s()
	{
		Student stu = new Student(1, "abc");
		return stu;
	}
	
	@Bean
	public Address a()
	{
		Address adr = new Address("Karve", "Pune");
		return adr;
	}
}