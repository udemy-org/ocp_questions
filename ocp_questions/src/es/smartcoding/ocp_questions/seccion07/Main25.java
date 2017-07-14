/**
 * 
 */
package es.smartcoding.ocp_questions.seccion07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.DoubleStream;

/**
 * @author jmendez
 *
 */
public class Main25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService service = Executors.newScheduledThreadPool(10);
		DoubleStream.of(3.14159, 2.71828) // (1)
				.forEach(c -> service.submit( // (2)
						() -> System.out.println(c - 1))); // (3)
		service.execute(() -> System.out.println("Printed")); // (4)
	}

}
