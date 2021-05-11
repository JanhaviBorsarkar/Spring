package com.usingGetterSetter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig 
{
	@Bean(name = "s1")
	public Student s()
	{
		Student stu = new Student();
		stu.setRno(1);
		stu.setName("abc");
		return stu;
	}
}
