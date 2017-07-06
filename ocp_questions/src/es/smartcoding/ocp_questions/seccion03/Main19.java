/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

import java.util.TreeSet;

/**
 * @author jmendez
 *
 */
public class Main19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("alfa");
		tree.add("Alfa");
		tree.add("ALFA");
		System.out.println(tree.ceiling("Al"));
	}

}
