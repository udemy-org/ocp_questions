/**
 * 
 */
package es.smartcoding.ocp_questions.seccion07;

import java.util.Arrays;

/**
 * @author jmendez
 *
 */
public class Main12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.asList(1.0, 2., .3, 4.0).parallelStream()
				.reduce(0.0, (i1, i2) -> i1 + i2)); // (1)
	}

}
