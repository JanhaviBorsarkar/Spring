package com.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext ap = new ClassPathXmlApplicationContext("beanPrimitive.xml");
		Student s = (Student)ap.getBean("p");
		System.out.println("Rollno: " +s.getRno());
		System.out.println("Name: " +s.getName());
	}
}
