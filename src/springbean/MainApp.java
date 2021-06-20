package springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		
		Phone phone=context.getBean("phoneObj",Phone.class);
		phone.showPhoneDetails();
		phone.startCallService();
		phone.startDataService();
	}

}
