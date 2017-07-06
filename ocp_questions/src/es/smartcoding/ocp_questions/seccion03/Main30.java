/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author jmendez
 *
 */
public class Main30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Comparator<Integer> c = (i1, i2) -> i1 - i2;
		List<Integer> list = Arrays.asList(5, 4, 7, 3, 1);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, 1));
	}


}
