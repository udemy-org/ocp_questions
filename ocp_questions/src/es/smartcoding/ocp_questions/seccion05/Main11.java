/**
 * 
 */
package es.smartcoding.ocp_questions.seccion05;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author jmendez
 *
 */
public class Main11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * El 13 de marzo de 2016 fue el fin de semana que adelantamos una hora
		 * el reloj, y el 6 de noviembre de 2016 es el fin de semana que
		 * atrasamos los relojes debido al ahorro energético.
		 * 
		 */
		ZoneId zone = ZoneId.of("US/Eastern");
		// LocalDate.of(2016, 11, 6)
		// LocalDate.of(2016, 11, 7)
		LocalDate date = LocalDate.of(2016, 3, 13);
		LocalTime time = LocalTime.of(2, 15);
		ZonedDateTime zoneDateTime = ZonedDateTime.of(date, time, zone);
	}

}
