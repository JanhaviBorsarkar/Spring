package autowiring;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			ApplicationContext ap = new ClassPathXmlApplicationContext("bean.xml");
			Student stu = (Student) ap.getBean("student", Student.class);
			
			System.out.println("Student details");
			System.out.println("Roll number: " +stu.getRno());
			System.out.println("Name: " +stu.getName());
			System.out.println("Area: " +stu.getAddr().getArea());
			System.out.println("City: " +stu.getAddr().getCity());
			
			ApplicationContext apc = new ClassPathXmlApplicationContext("bean.xml");
			Employee emp = (Employee) apc.getBean("employee", Employee.class);
			
			System.out.println("Employee Details:");
			System.out.println(emp.getEid());
			System.out.println(emp.getEname());
			System.out.println(emp.getEaddr().getArea());
			System.out.println(emp.getEaddr().getCity());
		
	}
}
