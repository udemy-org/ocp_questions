/**
 * 
 */
package es.smartcoding.ocp_questions.seccion04;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author jmendez
 *
 */
public class Main06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Predicate<? super String> predicate = s -> s.length() > 3;
		Stream<String> stream = Stream.iterate("-", (String s) -> s + s);
		boolean bool1 = stream.noneMatch(predicate); // (1)
		boolean bool2 = stream.anyMatch(predicate); // (2)
		System.out.println(bool1 + " " + bool2);
	}

}
