package reviewChapter4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.util.Arrays;

public class ChapterTest {
	public static void main(String[] args) {
		/*
		 * demoStringMethods();//helloWORLD demoStringEquality();//true, true, false,
		 * true demoArraySearch();//-5 demoVarargs();//r
		 * demoMultidimensionalArray();//lorem demoMathConvenienceMethods();//2
		 */	
		
		 			//November 11, 2024 at 1:59 AM: 2024-11-03T01:59-07:00[US/Pacific]
					//After one minute: 2025-11-03T01:00-08:00[US/Pacific]
					//true

	}
	
	public static void demoDaylightSavingTime() {
		LocalTime time = LocalTime.of(1, 59);
		LocalDate date = LocalDate.of(2024, 11, 3);
		ZoneId zone = ZoneId.of("US/Pacific");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);

		System.out.println("November 11, 2024 at 1:59 AM: " + zonedDateTime);
		
		
		final long minuteOffset = 1;
		zonedDateTime = zonedDateTime.plusMinutes(minuteOffset);
		System.out.println("After one minute: " + zonedDateTime);
		
		int newHour = zonedDateTime.get(ChronoField.HOUR_OF_DAY);
		
		int expectedHour = LocalTime.of(1, 0).getHour();
		
		System.out.println(newHour == expectedHour);
	}
	
	public static void demoDurationAndPeriod() {
		LocalDateTime ldt = LocalDateTime.of(2024, 7, 4, 0, 0);
		ldt = ldt.plus(Period.ofMonths(1));
		ldt = ldt.plus(Duration.ofHours(8));
	//2024, 8, 4, 8, 0		
		LocalDateTime ldt2 = LocalDateTime.of(2024, 8, 4, 8, 0);
		System.out.println(ldt.equals(ldt2));
	}

	public static void demoDateTimeZone() {
		LocalDateTime ldt = LocalDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.of(12, 0));
		ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("GMT+8"));
		ZonedDateTime zdt2 = zdt1.withZoneSameInstant(ZoneId.of("GMT+0"));
		// HINT: Pay attention to the timeszone offset difference when computing the output
		int hourOfDay1 = zdt1.get(ChronoField.HOUR_OF_DAY);
		int hourOfDay2 = zdt2.get(ChronoField.HOUR_OF_DAY);
		System.out.println(hourOfDay2);
		//gmt+8, 12:00
		//4:00
		System.out.println(hourOfDay1 - hourOfDay2);
	}
	
	public static void demoMathRandom() {
		final int target = 5;
		final int multiplier = 10;
		long current = 0;
		
		do {
			double random = Math.random();
			current = Math.round(multiplier * random);
		} while (current != target);
		
		System.out.println(current);
	}
	
	public static void demoStringMethods() {
		String s1 = "hello";
		String s2 = "world";
		s1 += s2.toUpperCase();
		System.out.println(s1);
	}
	
	public static void demoStringEquality() {
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = String.valueOf("Hello");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s2);
		System.out.println(s1 == s3); 
	}
	
	public static void demoArraySearch() {
		String[] arr = { "h", "e", "l", "l", "o" };
		Arrays.sort(arr);
		int result = Arrays.binarySearch(arr, "m");
		//e, h, l, l, o
		System.out.println(result);//-5
	}
	
	public static void demoVarargs() {
		Character[] str = { 'w', 'o', 'r', 'l', 'd' };
		Character result = ChapterTest.process(2, str);
		System.out.println(result);
	}
	
	private static Character process(int index, Character... args) {
		return args[index];
	}
	
	public static void demoMultidimensionalArray() {
		String[][] doubleArr = { { "hello", "world" },
												{ "lorem", "ipsum" } };
		
		System.out.println(doubleArr[1][0]);
	}
	
	public static void demoMathConvenienceMethods() {
		float[] num = { (float) 10.5, (float) 15.25, (float) 25.75, (float) 100.25, (float) 2.3, (float) 30.4 };
		float result = num[0];
		System.out.println(result);
		for (int i = 1; i < num.length; i++) {
			result = Math.min(result, num[i]);
		}
		
		System.out.println(Math.round(result));
	}
	
}
















