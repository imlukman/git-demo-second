package javaconfig;

import org.springframework.stereotype.Component;

@Component
public class GovernmentCollege {
	private final String WELCOME_GREET="Welcome in Government college campus";
	public String getCollegeGreet() {
		return WELCOME_GREET;
	}
}
