package studentInfo;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class SchoolManagement {
	public static void main(String[] args) {
		String[][] subjectsSem1 = new String[10][2];

		Scanner input = new Scanner(System.in);
		String name = "";

		System.out.print("Enter your Name: ");
		name = input.next();

		System.out.print("Enter your Section: ");
		String section = input.next();

		System.out.print("Enter your year:");
		int year = input.nextInt();

		Student student = new Student();
		String studentID = student.setID(name, section, year);

		System.out.println("Your id is:");
		System.out.println(studentID);

		String subject = "";
		int counterLoop = 0;
		while (!subject.equals("stop")) {
			System.out.print("Enter your subjects: ");
			subject = input.next();
			System.out.print("Enter the semester: ");
			String semester = input.next();

			subjectsSem1[counterLoop][0] = subject;
			subjectsSem1[counterLoop][1] = semester;
			counterLoop++;
		}
		System.out.println(Arrays.deepToString(subjectsSem1));

		System.out.println("Today is " + LocalDateTime.now());
		var zoneId = ZoneId.of("America/New_York");
		var amerikaNY = ZonedDateTime.of(LocalDateTime.now(), zoneId);
		System.out.println(amerikaNY.toInstant());
	}
}














































