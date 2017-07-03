/**
 * 
 */
package es.smartcoding.ocp_questions.seccion02;

import java.util.function.Predicate;

/**
 * @author jmendez
 *
 */

public class Main02 {
	int i;

	private static void test(Main02 main, Predicate<Main02> predicado) {
		String s = predicado.test(main) ? "sí" : "no";
		System.out.println(s);
	}

	public static void main(String[] args) {
		Main02 m = new Main02();
		m.i = 1;
		test(m, p -> p.i < 10);
	}

}
