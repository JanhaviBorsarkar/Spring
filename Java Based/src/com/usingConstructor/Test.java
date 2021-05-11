package com.usingConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext ap = new AnnotationConfigApplicationContext(AppConfig.class);
		Student stu = ap.getBean("s1", Student.class);
		System.out.println(stu);
	}

}
