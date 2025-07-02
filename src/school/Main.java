package school;

public class Main {
	
	public static void main(String[] args) {
		SchoolAdmin admin = new SchoolAdmin();
		SubstituteTeacher subTeacher = admin.assignTeacherSubstitute("Oscar", "IT 101", 30);
		SubstituteTeacher subTeacher2 = admin.assignTeacherSubstitute("Oscar", "IT 102", 30);
		
		Teacher teacher1 = admin.assignRegularTeacher("MarshalDTeach", "Turbo assembly");
		admin.assignSalary(35000,teacher1);
		System.out.println("My salary is "+teacher1.getSalary());
		
		teacher1.giveActivity();
		
		admin.assignSalarySubstitute(25000, subTeacher);
		admin.assignSalarySubstitute(30000, subTeacher2);
		
		subTeacher.teachClass();
		System.out.println("There are "+SubstituteTeacher.countOfSubstituteTeachers +""
				+ " substitute teacher.");
		subTeacher.giveActivity();
		subTeacher2.teachClass();
		
		System.out.println("Regular teacher: "+teacher1.getSalary());
		System.out.println("Substitute teacher: "+subTeacher.getSalary());
		System.out.println("Substitute teacher: "+subTeacher2.getSalary());
	}
	
}
