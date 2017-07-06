/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author pep
 *
 */
public class Main32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Comparator<Integer> c = (i1, i2) -> i2 - i1;
		List<Integer> list = Arrays.asList(5, 4, 7, 3, 1);
		Collections.sort(list, c);
		System.out.println(Collections.binarySearch(list, 7));

	}

}
