package javaconfig;

import org.springframework.stereotype.Component;

//author = lukman

@Component
public class College {
	private final String WELCOME_GREET="Welcome here where we train on hard work";
	public String getCollegeGreet() {
		return WELCOME_GREET;
	}
}
