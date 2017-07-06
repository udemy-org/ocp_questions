/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pep
 *
 */
public class Main04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("alpha");
		list.add("bravo");
		list.add(1+2); // (1)
		for (Object object : list) { // (2)
			System.out.print(object);
		}

	}

}
