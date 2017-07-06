/**
 * 
 */
package es.smartcoding.ocp_questions.seccion04;

import java.util.stream.Stream;

/**
 * @author jmendez
 *
 */



public class Main02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stream<String> stream = Stream.iterate(null, (String s) -> s + "1");
		stream.limit(3).forEach(System.out::print);
	}

}
