/**
 * 
 */
package es.smartcoding.ocp_questions.seccion04;

import java.util.stream.Stream;

/**
 * @author jmendez
 *
 */
public class Main10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stream.<String>generate(() -> "1").limit(10).forEach(System.out::print);
	}

}
