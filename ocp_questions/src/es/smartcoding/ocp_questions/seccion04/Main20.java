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
public class Main20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stream<String> stream = Arrays.asList("****", "**********", "*", "***", "*********").stream();
		Map<Boolean, List<String>> p = stream.collect(Collectors.groupingBy(string -> string.length() >= 5)); // (1)	
		System.out.println(p);
	}

}
