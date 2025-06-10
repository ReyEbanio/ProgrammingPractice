package review;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JavaTimeDates {
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.of(2025, 6, 10);
		LocalTime localTime = LocalTime.of(10, 30);
		LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
		ZoneId zId = ZoneId.of("Asia/Manila");
		//ZoneId zId2 = ZoneId.of("United Kingdom");
		ZonedDateTime zdt = ZonedDateTime.of(localDateTime, zId);
		Instant instant = zdt.toInstant();
		
		var zones=ZoneId.getAvailableZoneIds();
		for(String zone:zones) {
			System.out.println(ZonedDateTime.of(localDateTime, ZoneId.of(zone)));
			// the toInstant api transforms it to a UTC/GMT time
			System.out.println(ZonedDateTime.of(localDateTime, ZoneId.of(zone)).toInstant());
		}
	}
}
