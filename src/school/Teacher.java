package school;

public class Teacher {
	protected String name;
	protected String subject;
	private double salary;
	
	public Teacher(String name, String subject) {
		this.name = name;
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void teachClass() {
		System.out.println("My subject is "+subject);
		System.out.println("Teaching regular class. as a regular teacher.");
	}
	void giveActivity() {
		System.out.println("Teacher giving activity.");
	}
}
