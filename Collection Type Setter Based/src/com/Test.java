package com;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext ap = new ClassPathXmlApplicationContext("bean.xml");
		Student stu = (Student) ap.getBean("s");
		
		List<String> list = stu.getSlist();
		for(String l : list)
		{
			System.out.println(l);
		}
		
		Set<String> set = stu.getSset();
		for(String s : set)
		{
			System.out.println(s);
		}
		
		Map<String, String> map = stu.getSmap();
		Set<String> keys = map.keySet();
		for(String key : keys)
		{
			System.out.println(key);
			String v = map.get(key);
			System.out.println(v);
		}
	}
}
