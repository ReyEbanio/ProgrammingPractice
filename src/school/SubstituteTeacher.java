package school;

public class SubstituteTeacher extends Teacher{
	public static int countOfSubstituteTeachers;
	private int daysToCover;
	private double salary;
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public SubstituteTeacher(String name, String subject, int daysToCover) {
		super(name, subject);
		this.daysToCover = daysToCover;
		countOfSubstituteTeachers++;
	}
	@Override
	public void teachClass() {
		System.out.println("I am a substitute teacher for "+subject+". \nI will be"
				+ " teaching for "+daysToCover+" days");
	}

	
}
