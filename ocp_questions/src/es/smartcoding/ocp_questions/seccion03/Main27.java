/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jmendez
 *
 */
public class Main27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>(5); // (1)
		for (int i = 1; i <= 10; i++) {
			map.put(i, i + 1 * i); // (2)
		}
		System.out.println(map.get(0)); // (3)
	}

}
