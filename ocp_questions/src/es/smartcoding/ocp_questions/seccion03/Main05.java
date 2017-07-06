/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

import java.util.ArrayDeque;

/**
 * @author jmendez
 *
 */

public class Main05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayDeque<String> deque = new ArrayDeque<>();
		deque.push("alpha");
		deque.push("bravo");
		deque.push("charlie");
		deque.pop();
		deque.peek();
		while(deque.peek() != null) {
			System.out.print(deque.pop());
		}
	}

}
