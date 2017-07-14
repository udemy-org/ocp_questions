/**
 * 
 */
package es.smartcoding.ocp_questions.seccion07;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

/**
 * @author jmendez
 *
 */
public class Main28 {

	public static void await(CyclicBarrier cyclicBarrier) { // (1)
		// System.out.println(Thread.currentThread());
		try {
			cyclicBarrier.await();
		}
		catch (InterruptedException | BrokenBarrierException e) { }
	}

	public static void main(String[] args) {
		CyclicBarrier barrier = new CyclicBarrier(10, () -> System.out.println("En barrier!")); // (2)
		IntStream.iterate(1, i -> 1).limit(10).parallel().forEach(i -> await(barrier)); // (3)
	}

}
