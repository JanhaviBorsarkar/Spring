package byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			ApplicationContext ap = new ClassPathXmlApplicationContext("bean.xml");
			Student stu = (Student) ap.getBean("student");
			
			System.out.println("Roll number: " +stu.getRno());
			System.out.println("Name: " +stu.getName());
			System.out.println("Area: " +stu.getAddr().getArea());
			System.out.println("City: " +stu.getAddr().getCity());
		
	}

}
