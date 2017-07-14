/**
 * 
 */
package es.smartcoding.ocp_questions.seccion07;

import java.util.Arrays;

/**
 * @author jmendez
 *
 */
public class Main16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.asList("alfa", "bravo", "charlie", "delta").parallelStream()
				.reduce((s1, s2) -> s1.length() + s2).get()); 
		
		System.out.println(Arrays.asList("alfa", "bravo", "charlie").parallelStream()
				.reduce("", (s1, s2) -> s1.length() + s2)); 
		
		System.out.println(Arrays.asList("alfa", "bravo", "charlie").parallelStream()
				.reduce("", (s1, s2) -> s1.length() + s2, (s1, s2) -> s1 + s2)); 
	}

}
