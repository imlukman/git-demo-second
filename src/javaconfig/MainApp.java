package javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		GovernmentCollege clg=context.getBean("governmentCollege",GovernmentCollege.class);
		
		System.out.println(clg.getCollegeGreet());
		context.close();
	}

}
