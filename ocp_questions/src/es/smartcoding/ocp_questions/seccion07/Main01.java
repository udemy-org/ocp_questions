/**
 * 
 */
package es.smartcoding.ocp_questions.seccion07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

/**
 * @author jmendez
 *
 */



public class Main01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stream<String> stream = Stream.empty();
		Collection<String> collection = new ArrayList<>();
		Stream streamParallel1 = stream.parallel(); // (1)
		Stream streamParallel2 = collection.parallelStream(); // (2)
	}

}
