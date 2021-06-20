package core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorPropertyCoachApp {

	public static void main(String[] args) {
		
		//create Application context object and load property file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("application.xml");
		
		//get CricketCoach bean
		TennisCoach tennisCoach=context.getBean("tennisCoach",TennisCoach.class);
		
		//get Todays Workout 
		System.out.println(tennisCoach.getTodaysWorkout());
		
		//show coach details
		System.out.println(tennisCoach.getCoachDetails());
		
		//close context
		context.close();
	}

}
