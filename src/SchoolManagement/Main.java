package SchoolManagement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Main a = new Main();
		Scanner input = new Scanner(System.in);
		
		List<Student> studentInfo = new ArrayList<>();		
		
		Student student = a.addStudent(input);
		studentInfo.add(student);
		
		for(Student students : studentInfo) {
			students.displayPersonInformation();
			students.displayStudentInformation();
		}
		student.displayStudentSubject();
		input.close();
	}
	
	public Student addStudent(Scanner input) {
		System.out.print("Name: ");
		String studName = input.next();
		System.out.print("Age: ");
		int studAge = input.nextInt();
		Student newStudent = new Student(studName, studAge);
		System.out.println("How many subjects do you have?");
		int subjectCount = input.nextInt();
		System.out.println("Subjects: ");
		
		for(int i = 0; i < subjectCount; i++) {
		System.out.print("=>");
		String studSubject = input.next();
		Subjects studSubjects = new Subjects(studSubject);
		newStudent.addSubjects(studSubjects);
		}
		return newStudent;
	}
}













