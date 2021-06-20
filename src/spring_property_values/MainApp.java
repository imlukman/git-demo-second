package spring_property_values;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config2.xml");
		
		StudentProperty student=context.getBean("student",StudentProperty.class);
		student.showDetails();
	}

}
