/**
 * 
 */
package es.smartcoding.ocp_questions.seccion07;

import java.util.Arrays;

/**
 * @author jmendez
 *
 */
public class Main09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.asList("alfa", "bravo", "charlie").parallelStream().parallel() // (1)
				.reduce(0, (i, s) -> i + s.length(), (i1, i2) -> i1 + i2));
	}

}
