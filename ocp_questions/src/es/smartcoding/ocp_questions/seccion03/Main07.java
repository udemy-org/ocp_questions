/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

import java.util.ArrayDeque;

/**
 * @author jmendez
 *
 */
public class Main07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayDeque<String> deque = new ArrayDeque<>();
		deque.push("alpha");
		deque.push("bravo");
		deque.push("charlie");
		for (String s = deque.peek(); s != null;) {
			System.out.print(s);
			deque.pop();
		}
	}

}
