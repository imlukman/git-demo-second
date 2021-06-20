package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachApp {

	public static void main(String[] args) {
		
		//create Application context object and load property file
		ApplicationContext context= new ClassPathXmlApplicationContext("application.xml");
		
		//get CricketCoach bean
		CricketCoach cricketCoach=context.getBean("cricketCoach",CricketCoach.class);
		
		//get Todays Workout 
		System.out.println(cricketCoach.getTodaysWorkout());
	}

}
