package com.applicatincontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext ap = new ClassPathXmlApplicationContext("beanapplicatincontext.xml");
		Connection c = (Connection) ap.getBean("class");
		c.commit();
		c.rollback();
	}
}
