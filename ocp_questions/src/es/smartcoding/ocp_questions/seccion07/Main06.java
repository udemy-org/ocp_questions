/**
 * 
 */
package es.smartcoding.ocp_questions.seccion07;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

/**
 * @author jmendez
 *
 */
public class Main06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AtomicIntegerArray atomicIntArray = new AtomicIntegerArray(10);
		atomicIntArray.addAndGet(10, 1); // (1)
		System.out.println(atomicIntArray.get(1));
	}

}
