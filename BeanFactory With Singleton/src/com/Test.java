package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test 
{
	public static void main(String[] args) 
	{
		Resource rs = new ClassPathResource("bean.xml");
		BeanFactory bf = new XmlBeanFactory(rs);
		Student s = (Student) bf.getBean("stn");
		System.out.println(s);
		Student s1 = (Student) bf.getBean("stn");
		System.out.println(s1);
	}
}
