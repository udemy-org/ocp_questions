/**
 * 
 */
package es.smartcoding.ocp_questions.seccion04;

import java.util.stream.Stream;

/**
 * @author jmendez
 *
 */

public class Main03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stream<String> stream = Stream.iterate(null, (String s) -> s + "1"); // (1)
		System.out.println(stream.limit(2).map((String x) -> x + "2")); // (2)
	}

}
