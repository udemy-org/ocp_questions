/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

import java.util.ArrayDeque;

/**
 * @author jmendez
 *
 */
public class Main06 {

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
		while(deque.pop() != null) {
			System.out.print(deque.pop());
		}
	}

}
