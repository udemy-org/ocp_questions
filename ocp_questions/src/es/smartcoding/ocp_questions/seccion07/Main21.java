/**
 * 
 */
package es.smartcoding.ocp_questions.seccion07;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * @author jmendez
 *
 */
public class Main21 {

	static void dequeLogic(BlockingDeque<Integer> deque) throws Exception {
		deque.offer(99);
		deque.offerFirst(53, 3, TimeUnit.SECONDS);
		deque.offerLast(34, 1, TimeUnit.MINUTES);
		System.out.print(deque.pollFirst(100, TimeUnit.NANOSECONDS));
		System.out.print(" " + deque.pollLast(10, TimeUnit.MINUTES));
	}

	public static void main(String[] args) throws Exception {
		dequeLogic(new LinkedBlockingDeque<Integer>());
	}

}
