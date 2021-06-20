package core;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TennisCoach implements Coach {

	private String name;
	private int id;
	private int[] shot;
	private List<String> slots;
	
	public TennisCoach(String name, int id,int[] shot,List<String> slots) {
		this.name = name;
		this.id = id;
		this.shot=shot;
		this.slots=slots;
	}
	@Override
	public String getTodaysWorkout() {
		return "Practice....";
	}
	public String getCoachDetails() {
		return "coach details: \nname "+name+" id: "+id+" \nplay shot: "+Arrays.toString(shot)+
				"in slots:"+slots.size();
	}
}
