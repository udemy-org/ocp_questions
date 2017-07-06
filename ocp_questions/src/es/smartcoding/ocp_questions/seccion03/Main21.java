/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

import java.util.TreeSet;

/**
 * @author jmendez
 *
 */
public class Main21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("alfa1");
		tree.add("alfa2");
		tree.add("Alfa1");
		tree.add("Alfa2");
		System.out.println(tree.higher("alfa"));
	}

}
