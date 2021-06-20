package core;

public class HockeyCoach implements Coach {

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
		return "Practice....";
	}
	public String getCoachDetails() {
		return "coach details: name "+name+" id "+id;
	}
}
