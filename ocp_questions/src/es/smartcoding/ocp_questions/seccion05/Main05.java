/**
 * 
 */
package es.smartcoding.ocp_questions.seccion05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author jmendez
 *
 */

public class Main05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("2010–08–31", DateTimeFormatter.ISO_LOCAL_DATE);
		date.plusDays(2); 
//		date.plusHours(3); // (1)
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
	}

}
