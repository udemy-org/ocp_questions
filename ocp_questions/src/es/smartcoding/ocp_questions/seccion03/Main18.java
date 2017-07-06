/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jmendez
 *
 */
public class Main18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Number> set = new HashSet<>();
		set.add(13);
		set.add(9);
		set.add(null);
		set.add(new Double(67.89));
		set.add(178L);
		set.add(null);
		for (Number number : set) {
			System.out.println(number);
		}
		
	}

}
