package com.beanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test 
{
	public static void main(String[] args) 
	{
		Resource rs = new ClassPathResource("beanFactory.xml");
		BeanFactory bf = new XmlBeanFactory(rs);
		
		// without getBean method, object of Student is not creater.
		// Hence lazy loading
	}
}
