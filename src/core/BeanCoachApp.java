package core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCoachApp {

	public static void main(String[] args) {
		
		//create Application context object and load property file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("application.xml");
		
		//get CricketCoach bean
		CricketCoach cricketCoach=context.getBean("cricketCoach",CricketCoach.class);
		
		//get Todays Workout 
		System.out.println(cricketCoach.getTodaysWorkout());
		
		System.out.println();
		//close context
		context.close();
	}

}
