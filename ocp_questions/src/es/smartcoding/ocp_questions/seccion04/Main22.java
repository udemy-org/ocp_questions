/**
 * 
 */
package es.smartcoding.ocp_questions.seccion04;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * @author jmendez
 *
 */
public class Main22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UnaryOperator<Integer> u = x -> x * x;
		Function<Integer, Integer> f = x -> x * x;
//		BiFunction<Integer, Integer> f = x -> x*x;
//		BinaryOperator<Integer, Integer> f = x -> x*x;
	}

}
