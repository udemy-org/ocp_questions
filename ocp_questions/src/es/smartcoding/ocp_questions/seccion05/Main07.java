/**
 * 
 */
package es.smartcoding.ocp_questions.seccion05;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author jmendez
 *
 */
public class Main07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.of(2010, 8, 31, 19, 07, 0); 
		Period period = Period.of(1, 2, 3);
		ldt = ldt.minus(period);
		DateTimeFormatter dtf = DateTimeFormatter.
		ofLocalizedTime(FormatStyle.SHORT); 
		System.out.println(ldt.format(dtf));
	}

}
