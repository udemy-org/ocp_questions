/**
 * 
 */
package es.smartcoding.ocp_questions.seccion04;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * @author jmendez
 *
 */
public class Main09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IntStream stream = IntStream.empty(); 
		OptionalDouble opt1 = stream.average(); // (1)
		OptionalInt opt2 = stream.findAny(); // (2)
		int sum = stream.sum(); // (3)
		IntSummaryStatistics statistics = stream.summaryStatistics(); // (4)
	}

}
