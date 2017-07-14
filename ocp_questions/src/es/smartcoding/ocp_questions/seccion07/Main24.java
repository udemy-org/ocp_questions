/**
 * 
 */
package es.smartcoding.ocp_questions.seccion07;

import java.util.concurrent.Callable;

/**
 * @author jmendez
 *
 */
public class Main24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Callable<Integer> c1 = () -> 1;
		Callable<String> c2 = () -> "alfa" + "bravo" + 1;
		Callable<Integer> c3 = () -> {
			System.out.println("en Callable");
			return 1;
		};
	}

}
