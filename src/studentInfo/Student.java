package studentInfo;

public class Student {
	
	String name;
	String Section;
	int year;
	
	public String setID(String name, String Section, int year) {
		this.name = name;
		this.Section = Section;
		this.year = year; 
		char a = name.charAt(0); 
		
		String idStudent = name + "-"+a+ "-"+Section+"-"+year;
		return idStudent;
	}
	
}
