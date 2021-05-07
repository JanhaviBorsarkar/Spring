package com.secondary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext ap = new ClassPathXmlApplicationContext("beanSecondary.xml");
		Student s = (Student)ap.getBean("s");
		System.out.println("Rollno: " +s.getRno());
		System.out.println("Name: " +s.getName());
		System.out.println("Area: " +s.getAddr().getArea());
		System.out.println("City: " +s.getAddr().getCity());
	}

}
