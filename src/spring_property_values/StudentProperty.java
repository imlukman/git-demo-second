package spring_property_values;

import org.springframework.beans.factory.annotation.Value;

public class StudentProperty {

	@Value(value = "${student.name}")
	private String name;
	@Value(value = "${student.id}")
	private String id;
	@Value(value = "${student.standard}")
	private String standard;

	public void showDetails() {
		System.out.println(name+" "+id+" "+standard);
	}
	
}
