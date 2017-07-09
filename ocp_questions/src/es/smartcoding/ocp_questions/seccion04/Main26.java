/**
 * 
 */
package es.smartcoding.ocp_questions.seccion04;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author jmendez
 *
 */
public class Main26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = IntStream.range(1, 10).mapToObj(i -> i).collect(Collectors.toList());
		list.forEach(System.out::print);
		
		IntStream.range(1, 10).forEach(System.out::print);
	}

}
