/**
 * 
 */
package es.smartcoding.ocp_questions.seccion04;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author pep
 *
 */
public class Main04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Predicate<? super String> predicate = s -> s.startsWith("x"); // (1)
		Stream<String> stream1 = Stream.generate(() -> "xxx ");
		Stream<String> stream2 = Stream.generate(() -> "yyy ");
		boolean b1 = stream1.anyMatch(predicate);
		boolean b2 = stream2.anyMatch(predicate);
		System.out.println(b1 + " " + b2);
	}

}
