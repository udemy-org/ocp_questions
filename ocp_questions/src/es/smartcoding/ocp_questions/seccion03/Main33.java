/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pep
 *
 */
public class Main33 {
	
	public static <T> T identidad(T t) {
		return t;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map map = new HashMap<>(); // (1)
		map.put(123, "456");
		map.put("abc", "def");
//		System.out.println(map.contains("123")); // (2)
	}

}
