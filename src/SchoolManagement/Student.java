package SchoolManagement;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
	
	static private int genStudId = 111;
	private String studId;
	private List<Subjects> subjects;
	
	public Student(String fullName, int age) {
		super(fullName, age);
		var nameLength = fullName.length();
		var lastLetter =  String.valueOf(fullName.charAt(nameLength-1));
		var firstLetter = String.valueOf(fullName.charAt(0));
		this.studId = firstLetter+genStudId+lastLetter;
		genStudId++;
		this.subjects = new ArrayList<>();
	}
	public String getStudId() {
		return studId;
	}
	
	public void addSubjects(Subjects subject) {
		subjects.add(subject);
	}
	
	public void displayStudentInformation() {
		System.out.println("Your ID is: "+studId);
	}
	
	public void displayStudentSubject() {
		System.out.println("Subjects are:");
		List<Subjects> displaySub = getSubjects();
		for(Subjects subs : displaySub) {
			System.out.println(subs.subjects);
		}
	}
	public List<Subjects> getSubjects() {
		return subjects;
	}

	
}








