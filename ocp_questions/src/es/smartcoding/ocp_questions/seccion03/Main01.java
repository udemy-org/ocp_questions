/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author jmendez
 *
 */



public class Main01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Alfa", "Bravo", null, "Delta", null, "Charlie"));
		for (String string : list) {
			System.out.println(string);
		}
		List<String> list2 = new LinkedList<>(Arrays.asList("Alfa", "Bravo", null, "Delta", null, "Charlie"));
		for (String string : list2) {
			System.out.println(string);
		}
		System.out.println("done");
	}

}
