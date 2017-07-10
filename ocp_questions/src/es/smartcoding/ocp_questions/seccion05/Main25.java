/**
 * 
 */
package es.smartcoding.ocp_questions.seccion05;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author jmendez
 *
 */
public class Main25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDateTime ahora = LocalDateTime.now(); 
		ZonedDateTime ahoraConTimeZone = ZonedDateTime.of(ahora, ZoneId.of("Europe/Andorra")); 
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG); 
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL); 
		System.out.printf("%s%n%s", dateTimeFormatter1.format(ahoraConTimeZone), dateTimeFormatter2.format(ahoraConTimeZone)); 
	}

}
