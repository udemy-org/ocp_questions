/**
 * 
 */
package es.smartcoding.ocp_questions.seccion05;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 * @author jmendez
 *
 */
public class Main15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		ZoneId zoneId = ZoneId.systemDefault();
		ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
		long epochSeconds = 0;
		Instant instant1 = Instant.now(); // (1)
		Instant instant2 = Instant.ofEpochSecond(epochSeconds); // (2)
		// Instant instant3 = date.toInstant(); // (3)
		Instant instant4 = dateTime.toInstant(ZoneOffset.UTC); // (4)
		// Instant instant5 = time.toInstant(); // (5)
		Instant instant6 = zonedDateTime.toInstant(); // (6)
	}

}
