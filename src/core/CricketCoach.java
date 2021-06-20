package core;

public class CricketCoach implements Coach {

	private String name;
	private int id;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String getTodaysWorkout() {
		return "Practice to play hook shots";
	}
}
