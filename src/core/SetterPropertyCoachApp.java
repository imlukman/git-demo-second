package core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterPropertyCoachApp {

	public static void main(String[] args) {
		
		//create Application context object and load property file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("application.xml");
		
		//get CricketCoach bean
		HockeyCoach hockeyCoach=context.getBean("hockeyCoach",HockeyCoach.class);
		
		//get Todays Workout 
		System.out.println(hockeyCoach.getTodaysWorkout());
		
		//show coach details
		System.out.println(hockeyCoach.getCoachDetails());
		
		//close context
		context.close();
	}

}
