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
public class Main23 {

	static void dequeLogic(BlockingDeque<Integer> deque) throws InterruptedException { // (1)
		deque.offer(99);
		deque.offerFirst(53, 3, TimeUnit.SECONDS);
		deque.offerLast(34, 1, TimeUnit.MINUTES);
		System.out.printf("%d %d", deque.pollFirst(10, TimeUnit.MINUTES), deque.pollLast(10, TimeUnit.NANOSECONDS));
	}

	public static void main(String[] args) {
		try {
			dequeLogic(new LinkedBlockingDeque<Integer>());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
