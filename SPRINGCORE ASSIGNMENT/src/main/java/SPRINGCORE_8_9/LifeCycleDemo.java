package SPRINGCORE_8_9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("SPRINGCORE_8_9/configure.xml");
		Choco s=(Choco) context.getBean("s1");
		
		System.out.println(s);
		
		
		//registering shut down hook
		context.registerShutdownHook();  //this will first run destroy method
		
		Example e=(Example)context.getBean("e1");
		System.out.println(e);
		
	}

}
