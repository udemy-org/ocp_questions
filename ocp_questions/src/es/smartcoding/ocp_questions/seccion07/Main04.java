/**
 * 
 */
package es.smartcoding.ocp_questions.seccion07;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

/**
 * @author pep
 *
 */
public class Main04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AtomicLong atomicLong = new AtomicLong(0);
		final long[] nonAtomicLong = { 0 };
		IntStream.iterate(0, i -> i + 1).limit(100).parallel().forEach(i -> atomicLong.incrementAndGet());
		IntStream.iterate(0, i -> i + 1).limit(100).parallel().forEach(i -> ++nonAtomicLong[0]);
		System.out.printf("%d %d", atomicLong.get(), nonAtomicLong[0]);
	}

}
