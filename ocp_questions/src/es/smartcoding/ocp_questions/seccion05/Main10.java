/**
 * 
 */
package es.smartcoding.ocp_questions.seccion05;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author jmendez
 *
 */
public class Main10 {

	/**
	 * @param args
	 * 
	 * Day light time saving
	 */
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
		LocalTime time = LocalTime.of(1, 30);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime dateTime1 = ZonedDateTime.of(date, time, zone);
		ZonedDateTime dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);
		long horas = ChronoUnit.HOURS.between(dateTime1, dateTime2);
		int clock1 = dateTime1.getHour();
		int clock2 = dateTime2.getHour();
		System.out.printf("%d %d %d", clock1, clock2, horas);

	}

}
