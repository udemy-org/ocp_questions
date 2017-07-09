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
public class Main16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		ZoneId zoneId = ZoneId.systemDefault();
		ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
		long epochSeconds = 0;
		Instant instant1 = Instant.now(); 
		Instant instant2 = Instant.ofEpochSecond(epochSeconds);
		Instant instant3 = dateTime.toInstant(ZoneOffset.UTC); 
		Instant instant4 = zonedDateTime.toInstant(); 
		System.out.println(instant1);
		System.out.println(instant2);
		System.out.println(instant3);
		System.out.println(instant4);
	}

}
