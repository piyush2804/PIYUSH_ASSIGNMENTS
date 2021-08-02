package SPRINGCORE_1.SPRINGCORE_7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("SPRINGCORE_1/SPRINGCORE_7/config.xml");
		Demo d=(Demo) context.getBean("demo");
		System.out.println(d);

	}

}
