package reviewChapter4;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class JavaTimeDates {
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.of(2025, 6, 10);
		LocalTime localTime = LocalTime.of(10, 30);
		LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
		ZoneId zId = ZoneId.of("Asia/Manila");
		ZoneId zId2 = ZoneId.of("America/Cuiaba");
		
		
		ZonedDateTime zdt = ZonedDateTime.of(localDateTime, zId);
		ZonedDateTime zdt2 = ZonedDateTime.of(localDateTime, zId2);
		
		ZonedDateTime zdtOffset= zdt.plus(1, ChronoUnit.HOURS);
		
		System.out.println(zdt2.getOffset());
		
//		Instant instant = zdt.toInstant();
//		
//		var zones=ZoneId.getAvailableZoneIds();
//		for(String zone:zones) {
//			System.out.println(ZonedDateTime.of(localDateTime, ZoneId.of(zone)));
//			// the toInstant api transforms it to a UTC/GMT time
//			System.out.println(ZonedDateTime.of(localDateTime, ZoneId.of(zone)).toInstant());
//		}
	}
}
