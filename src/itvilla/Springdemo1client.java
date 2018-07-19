package itvilla;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import itvilla.emp;

public class Springdemo1client {

	public static void main(String[] args) {

		
		FileSystemXmlApplicationContext context = 
				new FileSystemXmlApplicationContext("Springdemo1xml.xml");
		
		dept d1 = (dept) context.getBean("mydept");
		
		emp e1 = (emp) context.getBean("myempbean1");
		e1.display();
		emp e2 = (emp) context.getBean("myempbean2");
		e2.display();

		

	}

}
