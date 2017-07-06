/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

import java.util.HashSet;
import java.util.Set;

/**
 * @author pep
 *
 */
public class Main34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("Alfa");
		s.add("Bravo");
		s.add("Charlie");
		s.forEach(System.out::println);

	}

}
