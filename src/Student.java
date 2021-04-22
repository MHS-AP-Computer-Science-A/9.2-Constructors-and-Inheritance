

public class Student extends Person{
	private double gpa;
	private String schedule;
	
	//Constructor
	public Student(String n, String b, double g, String s) {
		//Call superclass constructor first
		super(n, b);
		//Do anything else we want
		gpa = g;
		schedule = s;
	}

	
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
}
