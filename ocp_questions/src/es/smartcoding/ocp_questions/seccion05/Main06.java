/**
 * 
 */
package es.smartcoding.ocp_questions.seccion05;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author jmendez
 *
 */
public class Main06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Exception in thread "main" java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 40
		 */
		LocalDate date = LocalDate.of(2010, Month.AUGUST, 40); // (1)
		System.out.printf("%s %s %s", date.getYear(), date.getMonth(), date.getDayOfMonth());
	}

}
