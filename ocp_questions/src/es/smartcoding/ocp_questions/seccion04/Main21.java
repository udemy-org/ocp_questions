/**
 * 
 */
package es.smartcoding.ocp_questions.seccion04;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author jmendez
 *
 */
public class Main21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.empty();
		Stream<String> stream2 = Stream.empty();
		Map<Boolean, List<String>> list1 = stream1.collect(Collectors.partitioningBy(string -> string.startsWith("a")));
		Map<Boolean, List<String>> list2 = stream2.collect(Collectors.groupingBy(string -> string.startsWith("a")));
		System.out.println(list1 + " " + list2);
	}

}
