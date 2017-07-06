/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author jmendez
 *
 */
public class Main26 implements Comparator<Object> {

	public static void main(String[] args) {
		Object[] valores = { "bravo", "charlie", "alfa" };
		Arrays.sort(valores, new Main26());
		for (Object string : valores) {
			System.out.print(string + " ");
		}
	}

	@Override
	public int compare(Object o1, Object o2) { // (1)
		return 0;
//		return o1.compareTo(o2); // (2)
	}

}
