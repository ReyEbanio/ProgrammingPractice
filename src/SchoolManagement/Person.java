package SchoolManagement;

public class Person {
	private String fullName;
	private int age;
	
	public Person(String fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}

	public void displayPersonInformation() {
		System.out.println("Name : " +fullName);
		System.out.println("Age: " +age);
	}
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
