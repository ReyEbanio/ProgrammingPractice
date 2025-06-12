




package review;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class StringBuffer {
	public static void main(String[]args) {
		LocalTime time = LocalTime.now();
		LocalDate date = LocalDate.now();
		LocalDateTime LocalDT = LocalDateTime.now();
		ZoneId zId = ZoneId.systemDefault();
		ZonedDateTime zDT = ZonedDateTime.of(LocalDT, zId);
		
		
		
	}
}
