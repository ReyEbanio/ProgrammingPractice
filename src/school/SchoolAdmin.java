package school;

public class SchoolAdmin {
	public SubstituteTeacher assignTeacherSubstitute(String name, String subject, int days) {
		return new SubstituteTeacher(name, subject, days);
	}
	public Teacher assignRegularTeacher(String name, String subject) {
		return new Teacher(name, subject);
	}
	public void assignSalary(double salary, Teacher teacher) {
		teacher.setSalary(salary);
	}
	public void assignSalarySubstitute(double salary, SubstituteTeacher subTeacher) {
		subTeacher.setSalary(salary);
	}
	
}
