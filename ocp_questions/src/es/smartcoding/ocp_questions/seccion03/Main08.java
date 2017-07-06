/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

import java.util.ArrayDeque;
import java.util.concurrent.SynchronousQueue;

/**
 * @author jmendez
 *
 */
public class Main08 {

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
