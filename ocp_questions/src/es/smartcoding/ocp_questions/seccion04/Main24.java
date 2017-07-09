/**
 * 
 */
package es.smartcoding.ocp_questions.seccion04;

import java.util.stream.DoubleStream;

/**
 * @author jmendez
 *
 */
public class Main24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DoubleStream s = DoubleStream.of(1.2, 2.4);
		long l = s.peek(System.out::println).filter(x -> x > 2).count();
	}

}
