/**
 * 
 */
package es.smartcoding.ocp_questions.seccion04;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author jmendez
 *
 */
public class Main16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stream<Integer> stream1 = Stream.of(1);
		IntStream intStream = stream1.mapToInt(x -> x);
		DoubleStream doubleStream = intStream.mapToDouble(x -> x);
//		Stream<Integer> stream2 = doubleStream.mapToInt(x -> x); // (1)
//		stream2.forEach(System.out::print);
	}

}
