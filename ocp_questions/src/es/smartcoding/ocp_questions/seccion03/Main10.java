/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

import java.util.concurrent.SynchronousQueue;

/**
 * @author jmendez
 *
 */
public class Main10 {

	/**
	 * @param args
	 * 
	 * se cuelga
	 */
	public static void main(String[] args) {
		System.out.println("En main");
		SynchronousQueue<String> queue = new SynchronousQueue<>();
		try {
			queue.put("alfa");
			queue.put("bravo	");
			queue.put("charlie");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (String s = queue.element(); s != null;) {
			System.out.print(s);
		}
		
		System.out.println("OK");
	}

}
