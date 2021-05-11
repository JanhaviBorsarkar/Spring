package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext ap = new ClassPathXmlApplicationContext("bean.xml");
		
		Student stu = ap.getBean("s", Student.class);
		System.out.println("Student Details: ");
		System.out.println("Roll Number: " +stu.getRno());
		System.out.println("Name: " +stu.getName());
		System.out.println("Area: " +stu.getAddr().getArea());
		System.out.println("City: " +stu.getAddr().getCity());
		
		System.out.println("\n");
		
		Employee emp = ap.getBean("e", Employee.class);
		System.out.println("Employee Details: ");
		System.out.println("Employee Id: " +emp.getEid());
		System.out.println("Employee Name: " +emp.getEname());
		System.out.println("Area: " +emp.getAddr().getArea());
		System.out.println("City: " +emp.getAddr().getCity());
	}

}
