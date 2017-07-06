/**
 * 
 */
package es.smartcoding.ocp_questions.seccion04;

import java.util.stream.Stream;

/**
 * @author jmendez
 *
 */
public class Main07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stream<String> s = Stream.generate(() -> "meow");
		// boolean match = s.allMatch(String::isEmpty);
		// boolean match = s.anyMatch(String::isEmpty); // (1) bucle infinito
		// boolean match = s.findAny(String::isEmpty);
		// boolean match = s.findFirst(String::isEmpty);
		boolean match = s.noneMatch(String::isEmpty); // (2) bucle infinito
		System.out.println(match);
	}

}
