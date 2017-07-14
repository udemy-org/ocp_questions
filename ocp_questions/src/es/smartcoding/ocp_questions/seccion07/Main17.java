/**
 * 
 */
package es.smartcoding.ocp_questions.seccion07;

import java.util.Arrays;

/**
 * @author jmendez
 *
 */
public class Main17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * ovarbeilrahcalfaohcekortxofdelta
		 */
		
		System.out.println(Arrays.asList("alfa", "bravo", "charlie", "delta", "echo", "foxtrok", "golf").stream()
				.reduce((s1, s2) -> new StringBuilder(s1).reverse().toString() + "-" + new StringBuilder(s2).reverse().toString()).get()); 
		
		System.out.println(Arrays.asList("alfa", "bravo", "charlie").parallelStream()
				.reduce("", (s1, s2) -> s1 + s2)); 
		
		System.out.println(Arrays.asList("alfa", "bravo", "charlie").parallelStream()
				.reduce("", (s1, s2) -> s1 + s2, (s1, s2) -> s1 + s2)); 
		
	}

}
