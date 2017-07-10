/**
 * 
 */
package es.smartcoding.ocp_questions.seccion05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author jmendez
 *
 */
public class Main20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDate maxDate = LocalDate.MAX;
		LocalDate minDate = LocalDate.MIN;
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.printf("%s %s", f.format(minDate), f.format(maxDate));
	}

}
