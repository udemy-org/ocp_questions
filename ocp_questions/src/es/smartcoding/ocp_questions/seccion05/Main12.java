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
public class Main12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String m1 = Duration.of(1, ChronoUnit.MINUTES).toString(); 
		System.out.println(m1); // PT1M
		String m2 = Duration.ofMinutes(1).toString();
		System.out.println(m2); // PT1M
		String s = Duration.of(60, ChronoUnit.SECONDS).toString();
		System.out.println(s); // PT1M
		String d = Duration.ofDays(1).toString();
		System.out.println(d); // PT24H
		String p = Period.ofDays(1).toString();
		System.out.println(p); // P1D
		System.out.println(m1 == m2); // (1) false
		System.out.println(m1.equals(m2)); // (2) true
		System.out.println(m1.equals(s)); // (3) true
		System.out.println(d.equals(p)); // (4) false
	}

}
