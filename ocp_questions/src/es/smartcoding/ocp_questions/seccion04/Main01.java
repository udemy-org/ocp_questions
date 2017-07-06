/**
 * 
 */
package es.smartcoding.ocp_questions.seccion04;

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
		Stream<String> stream = Stream.iterate("", (String s) -> s + "1");
		System.out.println(stream.limit(2).map((String x) -> x + "2"));
	}

}
