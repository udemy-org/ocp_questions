/**
 * 
 */
package es.smartcoding.ocp_questions.seccion04;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author jmendez
 *
 */
public class Main27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stream<Integer> stream = Arrays.asList(3, 2, 7, 3, 5, 6, 1, 8, 9).stream();
		Map<Boolean, List<Integer>> map = stream.collect(Collectors.groupingBy(i -> i >= 5));
		System.out.println(map);
	}

}
