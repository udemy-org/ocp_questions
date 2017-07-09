/**
 * 
 */
package es.smartcoding.ocp_questions.seccion05;

import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author jmendez
 *
 */
public class Main13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String m1 = Duration.of(1, ChronoUnit.MINUTES).toString(); 
		System.out.println(m1); // (1) PT1M
		String m2 = Duration.ofMinutes(1).toString();
		System.out.println(m2); // (2) PT1M
		String s = Duration.of(60, ChronoUnit.SECONDS).toString();
		System.out.println(s); // (3) PT1M
		String d = Duration.ofDays(1).toString();
		System.out.println(d); // (4) PT24H
		String p = Period.ofDays(1).toString();
		System.out.println(p); // (5) P1D
	}

}
