/**
 * 
 */
package es.smartcoding.ocp_questions.seccion07;

import java.util.Arrays;

/**
 * @author jmendez
 *
 */
public class Main08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer i = Arrays.asList(1, 2, 3, 4, 5).stream().findAny().get();
		synchronized (i) { // (1)
			Integer j = Arrays.asList(6, 7, 8, 9, 10).parallelStream().sorted().findAny().get(); // (2)
			System.out.println(i + " " + j);
		}
	}

}
